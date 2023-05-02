package Data.Repositories;

import Data.Models.User;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserRepositoryImplTest {
    private UserRepository userRepository;
    private User user;
    @BeforeEach
    void setUp(){


    }
    @Test public void saveOneUser_countIsOne(){
        user = new User();
        userRepository = new UserRepositoryImpl();
        userRepository.save(user);
        assertEquals(1, userRepository.count());
    }
    @Test public void savedUserIdIsOne(){
        user = new User();
        userRepository = new UserRepositoryImpl();
        User savedUser = userRepository.save(user);
        assertEquals(1, savedUser.getId());
    }
    @Test public void saveOneUser_findUserById(){
        user = new User();
        userRepository = new UserRepositoryImpl();
        User savedUser = userRepository.save(user);
        User find = userRepository.findById(1);
        assertEquals(find, savedUser);
    }
    @Test public void saveOneUser_findByUser(){
        user = new User();
        user.setUserName("Samuel");
        userRepository = new UserRepositoryImpl();
        User savedUser = userRepository.save(user);
        User found = userRepository.findByUser("Samuel");
        System.out.println(found.toString());
        assertEquals("Samuel",found.getUserName());
    }
    @Test public void saveUser_deleteByIdCountIsZero(){
        user = new User();
        userRepository = new UserRepositoryImpl();
        User savedUser = userRepository.save(user);
        userRepository.deleteById(1);
        assertEquals(0,userRepository.count());
    }
    @Test public void saveUser_deleteByUserCountIszZero(){
        user = new User();
        userRepository = new UserRepositoryImpl();
        User savedUser = userRepository.save(user);
        savedUser.setUserName("Grace");
        userRepository.deleteByUser("Grace");
        assertEquals(0,userRepository.count());
    }
    @Test public void saveUser_deleteAll_countIsZero(){
        user = new User();
        userRepository = new UserRepositoryImpl();
        User savedUser = userRepository.save(user);
        userRepository.deleteAll();
        assertEquals(0,userRepository.count());
    }
}