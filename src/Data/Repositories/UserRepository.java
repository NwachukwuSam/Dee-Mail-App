package Data.Repositories;

import Data.Models.User;
import java.util.List;

public interface UserRepository {
    User save(User user);
    User findByUser(String userName);
    User findByEmail(String emailAddress);
    User findById(int id);
    List<User>findAll();
    void deleteByUser(String userName);
    void deleteById(int id);
    void deleteAll();
    int count();
}
