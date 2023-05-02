package Services;

import Dtos.Requests.LoginUserRequest;
import Dtos.Requests.RegisterUserRequest;
import Dtos.Response.RegisterResponse;

public interface UserServices {
    RegisterResponse register(RegisterUserRequest request);
    RegisterResponse findUser(String  userName);
    boolean loginUser(String username, String password);
    void delete(String  userName);
    int count();

    String findUserByEmail(String recipientEmail);
}
