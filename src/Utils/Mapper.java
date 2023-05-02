package Utils;

import Data.Models.Email;
import Data.Models.User;
import Dtos.Requests.CreateEmailRequest;
import Dtos.Requests.RegisterUserRequest;
import Dtos.Response.FindEmailResponse;
import Dtos.Response.RegisterResponse;

import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Mapper {
    public static User mapUser(RegisterUserRequest registerUserRequest){
        User user = new User();
        user.setFirstName(registerUserRequest.getFirstName());
        user.setLastName(registerUserRequest.getLastName());
        user.setPhoneNumber(registerUserRequest.getPhoneNumber());
        user.setPassword(registerUserRequest.getPassword());
        user.setUserName(registerUserRequest.getUserName());
        return user;
    }
    public static RegisterResponse mapUser(User user){
        RegisterResponse response = new RegisterResponse();
        response.setFullName(user.getFirstName() + " " + user.getLastName());
        response.setPhoneNumber(user.getPhoneNumber());
        Random rand = new Random();
        response.setEmail(user.getFirstName()+rand.nextInt(90)+"@deeMail.com");
        response.setUsername(user.getUserName());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");
        response.setDateRegistered(formatter.format(user.getDateRegistered()));
        return response;
    }

    public static Email mapEmail(CreateEmailRequest createEmailRequest){
        Email email = new Email();
        email.setRecipientEmail(createEmailRequest.getRecipientEmail());
        email.setTitle(createEmailRequest.getTitle());
        email.setBody(createEmailRequest.getBody());
        return email;
    }
    public static FindEmailResponse mapEmailRtn(Email email){
        FindEmailResponse findEmailResponse= new FindEmailResponse();
        findEmailResponse.setRecipientEmail(email.getRecipientEmail());
        findEmailResponse.setTitle(email.getTitle());
        findEmailResponse.setBody(email.getBody());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, hh:mm");
        email.setLocalDateTime(formatter.format(findEmailResponse.getDateSent()));
        return findEmailResponse;
    }
}