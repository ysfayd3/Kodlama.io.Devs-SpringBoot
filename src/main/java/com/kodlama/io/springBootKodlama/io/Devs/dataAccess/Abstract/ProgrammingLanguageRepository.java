package com.kodlama.io.springBootKodlama.io.Devs.dataAccess.Abstract;

import com.kodlama.io.springBootKodlama.io.Devs.entities.concreates.ProgramingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgramingLanguage> getAll();
    void add(ProgramingLanguage programingLanguage);

    void delete(int id);

    void update(ProgramingLanguage programingLanguage, int id);
    ProgramingLanguage getId(int id);
    //burada  kullancagımız fonksıyonları tanımladık bunları ınMemoryde tanımlayacagız.
}
