package com.gamezone.service;

import com.gamezone.controller.ComputerController;
import com.gamezone.entity.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService{

    private static ComputerService INSTANCE = null;

    public static ComputerService getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new ComputerServiceImpl();
        }
        return INSTANCE;
    }

    public static void setINSTANCE(ComputerService INSTANCE) {
        ComputerServiceImpl.INSTANCE = INSTANCE;
    }

    private ComputerServiceImpl(){}

    @Autowired
    private ComputerController computerController;

    @Override
    public Iterable<Computer> findAll() {
        return computerController.findAll();
    }

    @Override
    public Computer save(Computer computer) {
        return computerController.save(computer);
    }

    @Override
    public void update(Computer computer) {
        computerController.update(computer);
    }

    @Override
    public void delete(long id) {
        computerController.delete(id);
    }
}
