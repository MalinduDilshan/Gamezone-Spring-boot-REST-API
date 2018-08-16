package com.gamezone.service;

import com.gamezone.controller.ComputerController;
import com.gamezone.entity.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService{

    private static ComputerServiceImpl INSTANCE = null;

    public static ComputerServiceImpl getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new ComputerServiceImpl();
        }
        return INSTANCE;
    }

    private ComputerServiceImpl(){}

    public static void setINSTANCE(ComputerServiceImpl INSTANCE) {
        ComputerServiceImpl.INSTANCE = INSTANCE;
    }

    @Autowired
    private ComputerController computerController;

    @Override
    public List<Computer> findAll() {
        return computerController.findAll();
    }

    @Override
    public Computer save(Computer computer) {
        return computerController.save(computer);
    }
}
