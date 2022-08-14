package web231.dao;

import web231.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    void saveUser(User user);

    void updateUser(User user);
    User getUserById(long id);
    void removeUser(long id);

}
