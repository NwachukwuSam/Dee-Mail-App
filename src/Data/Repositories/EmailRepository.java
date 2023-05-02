package Data.Repositories;

import Data.Models.Email;

import java.util.List;

public interface EmailRepository {
    Email save(Email email);
    Email send(Email email);
    Email findById(int id);
    Email findByTitle(String title);
    List<Email>findAll();
    void deleteById(int id);
    void deleteByTitle(String title);
    void deleteAll();
    int count();


}
