package com.gamezone.service;

import com.gamezone.entity.Computer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ComputerService {
    List<Computer> findAll();
    Computer save(Computer computer);
}
