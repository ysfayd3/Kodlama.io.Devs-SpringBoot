package com.kodlama.io.springBootKodlama.io.Devs.webApi.controllers;

import com.kodlama.io.springBootKodlama.io.Devs.business.Abstract.ProgrammingLanguageService;
import com.kodlama.io.springBootKodlama.io.Devs.entities.concreates.ProgramingLanguage;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.ParameterizedTypeReference;

import java.util.List;

@RestController //annotation denir
@RequestMapping("/api/programmingLanguages")//iletisim ıcın kullanırız

public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;
    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getAll")//getall ile cagırabılır
    public List<ProgramingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }
    //get mapping anatasyonu bızım path yolun vermemızı saglar.
    //veriyi lıstelemek ıstıyorsa
    @GetMapping("/get")
    public String Synum(){
        return "Mavisim mavılendim";
    }

    //bu olusturdugumuz methodlara endpoint denıyor
    @PostMapping("/post")//veri kaydetmek ıstıyorsa
    public String save(){
        return  "Data save";
    }

    @DeleteMapping("/delete")
    public  String delete(){
        return "Data delete!";
    }

    @GetMapping({"/message","/message/{message}"})
    public String getMyMessage(@PathVariable(name="message",required = false) String message){
        return "Senin mesajın :"+ message;
    }
    @GetMapping("/message1")
    public String getMyMessage1(@RequestParam(name="message1",required = false) String message1){
        return "Senin mesajın :"+ message1;
    }


    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String header){
        return "Your header is"+header;
    }

}
