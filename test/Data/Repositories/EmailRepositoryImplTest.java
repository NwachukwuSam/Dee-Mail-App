package Data.Repositories;

import Data.Models.Email;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailRepositoryImplTest {
    private EmailRepository emailRepository;
    private Email email;
    private Email email2;

    @BeforeEach
    void setUp(){
        email = new Email();
        email2 = new Email();
        emailRepository = new EmailRepositoryImpl();
    }
    @Test
    public void saveOneEmail_countIsOneTest(){
        Email saveEmail = emailRepository.save(email);
        assertEquals(1,emailRepository.count());
    }
    @Test
    public void saveEmail_findEmailByIdTest(){
        Email saveEmail = emailRepository.save(email);
        Email save = emailRepository.save(email2);
        assertEquals(save, emailRepository.findById(2));
    }
    @Test
    public void saveEmail_findEmailByTitleTime(){
        Email saveEmail = emailRepository.save(email);
        Email save = emailRepository.save(email2);
        saveEmail.setTitle("My first Day in School");
        save.setTitle("Requesting Mail");
        assertEquals(saveEmail,emailRepository.findByTitle("My first Day in School"));
    }
    @Test
    public void saveTwoEmails_deleteByIdTest(){
        Email saveEmail = emailRepository.save(email);
        Email save = emailRepository.save(email2);
        saveEmail.setBody("It all started when Ali Went to the Mall to pick up groceries");
        save.setBody("Here is the mail you requested");
        emailRepository.deleteById(1);
        assertEquals(1, emailRepository.count());
        System.out.println(saveEmail.getBody());
    }
    @Test
    public void saveTwoEmails_deleteByTitleTest(){
        Email saveEmail = emailRepository.save(email);
        Email save = emailRepository.save(email2);
        saveEmail.setTitle("First Email");
        saveEmail.setBody("It all started when Ali Went to the Mall to pick up groceries");
        save.setTitle("Second Email");
        save.setBody("Here is the mail you requested");
        emailRepository.deleteByTitle("First Email");
        assertEquals(1, emailRepository.count());
        System.out.println(saveEmail.getBody());
    }
    @Test
    public void saveTwoMails_DeleteAllTest(){
        Email saveEmail = emailRepository.save(email);
        Email save = emailRepository.save(email2);
        saveEmail.setTitle("First Email");
        saveEmail.setBody("It all started when Ali Went to the Mall to pick up groceries");
        save.setTitle("Second Email");
        save.setBody("Here is the mail you requested");
        emailRepository.deleteAll();
        assertEquals(0, emailRepository.count());
        System.out.println(saveEmail.getBody());
    }

}