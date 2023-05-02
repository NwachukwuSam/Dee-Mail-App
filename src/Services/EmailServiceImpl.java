package Services;

import Data.Models.Email;
import Data.Models.User;
import Data.Repositories.EmailRepository;
import Data.Repositories.EmailRepositoryImpl;
import Dtos.Requests.CreateEmailRequest;
import Dtos.Response.FindEmailResponse;
import Utils.Mapper;

public class EmailServiceImpl implements EmailServices{
    EmailRepository emailRepository = new EmailRepositoryImpl();
    UserServices userServices = new UserServiceImpl();
    @Override
    public FindEmailResponse createEmail(CreateEmailRequest createEmailRequest) {
        checkRecipientEmailExist(createEmailRequest.getRecipientEmail());
        var saveEmail = Mapper.mapEmail(createEmailRequest);
        Email emailSaved = emailRepository.save(saveEmail);

        FindEmailResponse response = Mapper.mapEmailRtn(emailSaved);
        return response;
    }

    @Override
    public FindEmailResponse sendEmail(CreateEmailRequest request) {

        return null;
    }
    public void checkRecipientEmailExist(String eMail){
        try {
            userServices.findUserByEmail(eMail);
        }
        catch (NullPointerException ex) {
            throw new IllegalArgumentException("The Email You entered does not exist");
        }
    }
    @Override
    public FindEmailResponse findEmailByTitle(String emailTitle) {
        Email foundEmail = emailRepository.findByTitle(emailTitle);
        if (foundEmail == null) throw new NullPointerException("Email does Not Exist");
        return Mapper.mapEmailRtn(foundEmail);
    }

    @Override
    public void deleteEmailbyTitle(String emailTitle) {
        Email foundEmail = emailRepository.findByTitle(emailTitle);
        if (foundEmail == null) throw new NullPointerException("Email does Not Exist");
        emailRepository.deleteByTitle(emailTitle);
    }
}
