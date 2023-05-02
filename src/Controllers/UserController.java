package Controllers;


import Data.Models.User;
import Dtos.Requests.RegisterUserRequest;
import Dtos.Response.FindUserResponse;
import Dtos.Response.RegisterResponse;
import Services.UserServiceImpl;
import Services.UserServices;
import Utils.Mapper;
public class UserController {
    private static UserServices userServices = new UserServiceImpl();

    public Object register(RegisterUserRequest registerUserRequest) {
        try {
            return userServices.register(registerUserRequest);
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }

    public boolean login(String userName, String password) {
        return      userServices.loginUser(userName, password);
    }

    public Object findUser(String userName) {
        try {
            return userServices.findUser(userName);
        } catch (NullPointerException ex) {
            return ex.getMessage();
        }
    }

    public void delete(String userName) {
        userServices.delete(userName);
    }
}
