package Controllers;

import Dtos.Requests.CreateEmailRequest;
import Services.EmailServiceImpl;
import Services.EmailServices;

public class EmailCntroller {
    private EmailServices emailServices = new EmailServiceImpl();
    public Object createEmail(CreateEmailRequest createEmailRequest){
        try {
            return emailServices.createEmail(createEmailRequest);
        }
        catch (NullPointerException ex) {
            return ex.getMessage();
        }
    }
    public Object findEmail(String title){
        try {
            return emailServices.findEmailByTitle(title);
        }
        catch (NullPointerException ex){
            return ex.getMessage();
        }
    }
    public void deleteMail(String title){
        emailServices.deleteEmailbyTitle(title);
    }
}
