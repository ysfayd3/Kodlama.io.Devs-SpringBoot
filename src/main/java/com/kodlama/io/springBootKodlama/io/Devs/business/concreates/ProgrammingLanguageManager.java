package com.kodlama.io.springBootKodlama.io.Devs.business.concreates;

import com.kodlama.io.springBootKodlama.io.Devs.business.Abstract.ProgrammingLanguageService;
import com.kodlama.io.springBootKodlama.io.Devs.dataAccess.Abstract.ProgrammingLanguageRepository;
import com.kodlama.io.springBootKodlama.io.Devs.entities.concreates.ProgramingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service//bu bır busıness nesnesıddır
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }
    //id kontrolu yapıyoruz . id lıstede var mı ?
    //eger varsa asagıda ıd getırecegız ve sonrasında delete fonksıyonumuzda sılecegız
    public boolean IdCheck(int id){
        for (ProgramingLanguage programingLanguage:getAll()){
            if (programingLanguage.getId()==id){
                return  true;
            }

        }
        return false;
    }
    public boolean ProgrammingNameİsNotNull(String name){
       return name.isEmpty();
    }

    public  boolean ProgrammingName(String name){
        for (ProgramingLanguage programingLanguage: getAll())
        {
           if ( programingLanguage.getName().equals(name)){
              return true;
           }
        }
        return false;
    }

    @Override
    public List<ProgramingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public void add(ProgramingLanguage programingLanguage) {
      if (ProgrammingName(programingLanguage.getName())||ProgrammingNameİsNotNull(programingLanguage.getName())){
          throw new RuntimeException("Programlama ismi tekrar edemez veya Programalama dili bos gecemez.");
      }
      else {
          programmingLanguageRepository.add(programingLanguage);
          System.out.println("Programlama  ismi Başarıyla eklendi");
      }

    }

    @Override
    public void delete(int id) {
       if (IdCheck(id)){
           programmingLanguageRepository.delete(id);
           System.out.println("Programlama  ismi Başarıyla silindi");
       }
       else {
           throw new RuntimeException("Bu id' de bir Programlama bulunamadı.");
       }

    }

    @Override
    public void update(ProgramingLanguage programingLanguage, int id) {
    if (IdCheck(id)){
        programmingLanguageRepository.update(programingLanguage,id);
        System.out.println("Proramlama ismi basarıyla guncellendi");
    }
    else {
        throw new RuntimeException("Bu id' de bir Programlama bulunamadı. ");
    }
    }

    @Override
    public ProgramingLanguage getId(int id) {
        if (IdCheck(id)){
            return programmingLanguageRepository.getId(id);
        }
        else {
            throw new RuntimeException("Bu id' de bir Programlama bulunamadı.");
        }
    }
}
