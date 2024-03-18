package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDAO;

    @Override
    @Transactional
    public void saveUser(User user) {userDAO.saveUser(user);
    }


    @Override
    @Transactional
    public void updateUser(User user){userDAO.updateUser(user);}

    @Override
    @Transactional
    public List<User> showAllUsers() {
        return userDAO.showAllUsers();
    }

    @Override
    @Transactional
    public User getUser(long id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userDAO.deleteUser(id);
    }
}

