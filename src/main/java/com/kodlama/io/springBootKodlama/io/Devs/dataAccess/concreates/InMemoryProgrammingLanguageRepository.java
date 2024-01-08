package com.kodlama.io.springBootKodlama.io.Devs.dataAccess.concreates;

import com.kodlama.io.springBootKodlama.io.Devs.dataAccess.Abstract.ProgrammingLanguageRepository;
import com.kodlama.io.springBootKodlama.io.Devs.entities.concreates.ProgramingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository//bu sınıf bır dataacces nesnesıdır sprınge onu anlatıryoruz
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    private ProgrammingLanguageRepository programmingLanguageRepository;

    List<ProgramingLanguage> programingLanguagelist;
    public InMemoryProgrammingLanguageRepository() {
        //bos bır lıste tanımlıyoruz
        programingLanguagelist= new ArrayList<ProgramingLanguage>();
        programingLanguagelist.add(new ProgramingLanguage(1,"C#"));
        programingLanguagelist.add(new ProgramingLanguage(2,"Python"));
        programingLanguagelist.add(new ProgramingLanguage(3,"Java"));
        programingLanguagelist.add(new ProgramingLanguage(4,"C"));
        programingLanguagelist.add(new ProgramingLanguage(5,"Dart"));
        programingLanguagelist.add(new ProgramingLanguage(6,"JavaScript"));

    }
    @Override
    public List<ProgramingLanguage> getAll() {
        return programingLanguagelist;
    }

    @Override
    public void add(ProgramingLanguage programingLanguage) {
        programingLanguagelist.add(programingLanguage);

    }

    @Override
    public void delete(int id) {
        programingLanguagelist.remove(id);
    }

    @Override
    public void update(ProgramingLanguage programingLanguage, int id) {
        programingLanguagelist.set(id,programingLanguage);

    }

    @Override
    public ProgramingLanguage getId(int id) {
        return programingLanguagelist.get(id);
    }
}
