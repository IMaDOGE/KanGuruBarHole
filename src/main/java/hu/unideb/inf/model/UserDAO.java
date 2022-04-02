package hu.unideb.inf.model;

import java.util.List;

public interface UserDAO extends AutoCloseable{
    void saveUser(User u);
    void deleteUser(User u);
    void updateUser(User u);
    List<User> getUsers();
}
