package com.kodlama.io.springBootKodlama.io.Devs;

import com.kodlama.io.springBootKodlama.io.Devs.business.Abstract.ProgrammingLanguageService;
import com.kodlama.io.springBootKodlama.io.Devs.business.concreates.ProgrammingLanguageManager;
import com.kodlama.io.springBootKodlama.io.Devs.dataAccess.concreates.InMemoryProgrammingLanguageRepository;
import com.kodlama.io.springBootKodlama.io.Devs.entities.concreates.ProgramingLanguage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//ProgrammingLanguageService programmingLanguageService = new ProgrammingLanguageManager(new InMemoryProgrammingLanguageRepository());

		ProgrammingLanguageService programmingLanguageService=new ProgrammingLanguageManager(new InMemoryProgrammingLanguageRepository());

		//System.out.println(programmingLanguageService.getId(1).getName());
		//programmingLanguageService.add(new ProgramingLanguage(9,"rust"));
		//programmingLanguageService.update(new ProgramingLanguage(8,"DARTTTTT"),5);
		//programmingLanguageService.getId(2);
		programmingLanguageService.delete(0);

		for (ProgramingLanguage programingLanguage:programmingLanguageService.getAll()){
			System.out.println(programingLanguage.getId()+ "  "+ programingLanguage.getName());
		}

	}

}
