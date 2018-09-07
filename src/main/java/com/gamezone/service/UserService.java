package com.gamezone.service;

import com.gamezone.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    Iterable<User> findAll();
    User save(User user);
    User findById(long id);
    void update(User user);
    void delete(long id);
}
