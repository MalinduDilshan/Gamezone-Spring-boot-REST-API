package com.gamezone.controller;

import com.gamezone.entity.Computer;
import com.gamezone.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerControllerImpl implements ComputerController{

    @Autowired
    private ComputerRepository computerRepository;

    @Override
    public Iterable<Computer> findAll() {
        return computerRepository.findAll();
    }

    @Override
    public Computer save(Computer computer) {
        return computerRepository.save(computer);
    }

    @Override
    public void update(Computer computer) {
        computerRepository.save(computer);
    }

    @Override
    public void delete(long id) {
        computerRepository.deleteById(id);
    }
}
