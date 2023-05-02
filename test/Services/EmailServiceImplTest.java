package Services;

import Data.Models.Email;
import Data.Repositories.EmailRepositoryImpl;
import Dtos.Requests.CreateEmailRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceImplTest {
    private EmailServices emailServices = new EmailServiceImpl();
    private Email email;

    @BeforeEach
    void doThisFirst(){
        email = new Email();
        emailServices = new EmailServiceImpl();
    }
    @Test
    public void saveEmail(){

    }

}