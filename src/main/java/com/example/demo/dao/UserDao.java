package com.example.demo.dao;



import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void updateUser(User user);


    List<User> showAllUsers();

    User getUser(long id);


    void deleteUser(long id);

}
