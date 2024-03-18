package com.example.demo.dao;

import com.example.demo.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {entityManager.persist(user);}

    @Override
    public void updateUser(User user){entityManager.merge(user);}

//    @Override
//    public void saveUser(User user) {

    @Override
    public List<User> showAllUsers() {
        return entityManager.createQuery("select u from User u order by id", User.class).getResultList();
    }

    @Override
    public User getUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(long id) {
        User userToDelete = entityManager.find(User.class, id);
        if (userToDelete != null) {
            entityManager.remove(userToDelete);}
    }
}
