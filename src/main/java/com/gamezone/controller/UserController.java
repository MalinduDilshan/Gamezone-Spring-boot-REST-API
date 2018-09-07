package com.gamezone.controller;

import com.gamezone.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserController {

    Iterable<User> findAll();
    User save(User user);
    User findById(long id);
    void update(User user);
    void delete(long id);
}
