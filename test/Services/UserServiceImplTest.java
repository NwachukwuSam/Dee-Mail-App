package Services;

import Data.Models.User;
import Dtos.Requests.RegisterUserRequest;
import Utils.Mapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
   private UserServices userServices = new UserServiceImpl();
   private User user;

    @Test
    public void findByUserName(){
       RegisterUserRequest request = new RegisterUserRequest();
       request.setUserName("Tiny");
       userServices.register(request);
       var find = userServices.findUser("Tiny");
       assertEquals(request.getUserName(), find.getUsername());
    }



}