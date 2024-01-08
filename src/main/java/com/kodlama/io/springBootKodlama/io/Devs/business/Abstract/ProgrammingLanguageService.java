package com.kodlama.io.springBootKodlama.io.Devs.business.Abstract;

import com.kodlama.io.springBootKodlama.io.Devs.entities.concreates.ProgramingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgramingLanguage> getAll();
    void add(ProgramingLanguage programingLanguage);
    void delete(int id);
    void update(ProgramingLanguage programingLanguage,int id);
    ProgramingLanguage getId(int id);
    //burada  kullancagımız fonksıyonları tanımladık bunları ınMemoryde tanımlayacagız.
}
