package com.gamezone.service;

import com.gamezone.entity.Computer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ComputerService {
    Iterable<Computer> findAll();
    Computer save(Computer computer);
    void update(Computer computer);
    void delete(long id);
}
