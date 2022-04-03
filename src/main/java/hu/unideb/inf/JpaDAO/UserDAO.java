package hu.unideb.inf.JpaDAO;

import hu.unideb.inf.entity.User;

import java.util.List;

public interface UserDAO extends AutoCloseable
{
    void saveUser(User u);
    void deleteUser(User u);
    void updateUser(User u);
    List<User> getUsers();
}
