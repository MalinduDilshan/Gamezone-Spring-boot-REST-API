package com.gamezone.service;

import com.gamezone.controller.UserController;
import com.gamezone.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserController userController;

    private static UserService INSTANCE = null;

    public static UserService getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new UserServiceImpl();
        }
        return INSTANCE;
    }

    public static void setINSTANCE(UserService INSTANCE) {
        UserServiceImpl.INSTANCE = INSTANCE;
    }

    private UserServiceImpl() {
    }

    @Override
    public Iterable<User> findAll() {
        return userController.findAll();
    }

    @Override
    public User save(User user) {
        return userController.save(user);
    }

    @Override
    public User findById(long id) {
        return userController.findById(id);
    }

    @Override
    public void update(User user) {
        userController.update(user);
    }

    @Override
    public void delete(long id) {
        userController.delete(id);
    }
}
