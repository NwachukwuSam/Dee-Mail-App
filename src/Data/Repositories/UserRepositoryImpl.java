package Data.Repositories;

import Data.Models.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserRepositoryImpl implements UserRepository {

    private List<User> myUsers = new ArrayList<>();
    private int count = 0;
    @Override
    public User save(User user) {
        boolean userHasNotBeenSaved = user.getId() == 0;
        if (userHasNotBeenSaved){
            user.setId(generateId());
            Random rand = new Random();
            user.setUserName(user.getFirstName()+rand.nextInt(90));
            myUsers.add(user);
            count++;
        }
        return user;
    }
    private int generateId(){
        return count+1;
    }

    @Override
    public User findByUser(String userName) {
        for (User theUser: myUsers)
            if (theUser.getUserName().equalsIgnoreCase(userName)) {
                return theUser;
            }
        return null;
    }
    public User generateEmail(){
        Random rand = new Random();
        User user = new User();
        user.seteMail(user.getFirstName()+rand.nextInt(90));
        return null;
    }

    @Override
    public User findByEmail(String emailAddress) {

        return null;
    }

    @Override
    public User findById(int id) {
        for (User theUser: myUsers) {
            if (theUser.getId() == id)
                return theUser;
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return myUsers;
    }

    @Override
    public void deleteByUser(String userName) {
        for (User theUser: myUsers){
            if (theUser.getUserName().equalsIgnoreCase(userName)){
                myUsers.remove(theUser);
                count--;
                break;
            }
        }
    }
    @Override
    public void deleteById(int id) {
        for (User theUser: myUsers) {
            if (theUser.getId() == id)
                myUsers.remove(theUser);
            count--;
            break;
        }
    }
    @Override
    public void deleteAll() {
        myUsers.clear();
        count = 0;
    }

    @Override
    public int count() {
        return count;
    }


}
