package com.gamezone.service;

import com.gamezone.controller.ComputerController;
import com.gamezone.entity.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService{

    @Autowired
    private ComputerController computerController;

    @Override
    public List<Computer> findAll() {
        return computerController.findAll();
    }

    @Override
    public void save(Computer computer) {
        computerController.save(computer);
    }
}
