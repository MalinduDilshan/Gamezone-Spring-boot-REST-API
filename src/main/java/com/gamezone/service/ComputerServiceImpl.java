package com.gamezone.service;

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

    @Autowired
    private TerminalController terminalController;

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

        Computer returnComputer = computerController.save(computer);

        Terminal terminal = new Terminal();

        terminal.setAssignTime(new Date());
        terminal.setDuration(0);
        terminal.setProgressValue(0);
        terminal.setLeftTime(new Date());
        terminal.setStatus(false);
        terminal.setPowerCut(false);
        terminal.setComputerId(returnComputer.getPrimaryKey());

        terminalController.save(terminal);

        return returnComputer;
    }

    @Override
    public void update(Computer computer) {
        computerController.update(computer);
    }

    @Override
    public void delete(long id) {
        terminalController.deleteByComputerId(id);
        computerController.delete(id);
    }
}
