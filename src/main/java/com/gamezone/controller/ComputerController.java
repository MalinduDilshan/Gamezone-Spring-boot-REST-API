package com.gamezone.controller;

import com.gamezone.entity.Computer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ComputerController {
    Iterable<Computer> findAll();
    Computer save(Computer computer);
    Computer findById(long id);
    void update(Computer computer);
    void delete(long id);
}
