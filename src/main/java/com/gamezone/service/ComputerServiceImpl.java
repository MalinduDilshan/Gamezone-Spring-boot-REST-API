package com.gamezone.service;

import com.gamezone.common.TerminalStatusUtils;
import com.gamezone.controller.ComputerController;
import com.gamezone.controller.TerminalController;
import com.gamezone.entity.Computer;
import com.gamezone.entity.Terminal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService {

    @Autowired
    private ComputerController computerController;

    private static ComputerService INSTANCE = null;

    public static ComputerService getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new ComputerServiceImpl();
        }
        return INSTANCE;
    }

    public static void setINSTANCE(ComputerService INSTANCE) {
        ComputerServiceImpl.INSTANCE = INSTANCE;
    }

    private ComputerServiceImpl() {
    }

    @Override
    public Iterable<Computer> findAll() {
        return computerController.findAll();
    }

    @Override
    public Computer save(Computer computer) {
        return computerController.save(computer);
    }

    @Override
    public Computer findById(long id) {
        return computerController.findById(id);
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
