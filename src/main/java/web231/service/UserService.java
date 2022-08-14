package web231.service;

import org.springframework.stereotype.Component;
import web231.model.User;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();
    void saveUser(User user);

    void updateUser(User user);
    User getUserById(long id);
    void removeUser(long id);
}
