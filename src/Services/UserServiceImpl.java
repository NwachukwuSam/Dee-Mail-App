package Services;

import Data.Models.User;
import Data.Repositories.UserRepository;
import Data.Repositories.UserRepositoryImpl;
import Dtos.Requests.RegisterUserRequest;
import Dtos.Response.RegisterResponse;
import Utils.Mapper;


public class UserServiceImpl implements UserServices{
    private static UserRepository userRepository = new UserRepositoryImpl();

    int count;
    @Override
    public RegisterResponse register(RegisterUserRequest request) {
        if (emailExist(request.getPhoneNumber())) throw new IllegalArgumentException(request.getUserName()+ "Email Already Exists");
        var user = Mapper.mapUser(request);
        User savedUser = userRepository.save(user);
        RegisterResponse response = Mapper.mapUser(savedUser);
        return response;

    }
    private boolean emailExist(String emailAddress) {
        User find = userRepository.findByEmail(emailAddress);
        return find != null;
    }
    @Override
    public RegisterResponse findUser(String userName) {
        User foundUser = userRepository.findByUser(userName);
        if (foundUser == null) throw new NullPointerException("User does Not Exist");
        return Mapper.mapUser(foundUser);
    }

    @Override
    public void delete(String  userName) {
        User foundUser = userRepository.findByUser(userName);
        if (foundUser == null) throw new NullPointerException("User does Not Exist");
        else userRepository.deleteByUser(userName);
        count--;
    }
    public boolean loginUser(String userName, String password) {
        User foundUser = userRepository.findByUser(userName);
        if (foundUser.getPassword().equals(password)){
            return true;
        }
        else throw new IllegalArgumentException("Invalid Login Details");

    }
    @Override
    public int count() {
        return count;
    }

    @Override
    public String findUserByEmail(String recipientEmail) {
        User find = userRepository.findByEmail(recipientEmail);
        return recipientEmail;
    }
}
