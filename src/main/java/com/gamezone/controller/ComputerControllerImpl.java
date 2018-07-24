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
    public List<Computer> findAll() {
        List<Computer> computerList = new ArrayList<>();
        Iterable<Computer> computerIterable = computerRepository.findAll();
        for (Computer computer: computerIterable) {
            computerList.add(computer);
        }
        return computerList;
    }

    @Override
    public void save(Computer computer) {
        computerRepository.save(computer);
    }
}
