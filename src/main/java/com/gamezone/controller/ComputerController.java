package com.gamezone.controller;

import com.gamezone.entity.Computer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ComputerController {
    List<Computer> findAll();
    Computer save(Computer computer);
}
