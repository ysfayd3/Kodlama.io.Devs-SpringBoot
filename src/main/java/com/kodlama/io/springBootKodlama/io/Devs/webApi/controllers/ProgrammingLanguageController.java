package com.kodlama.io.springBootKodlama.io.Devs.webApi.controllers;

import com.kodlama.io.springBootKodlama.io.Devs.business.Abstract.ProgrammingLanguageService;
import com.kodlama.io.springBootKodlama.io.Devs.entities.concreates.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
