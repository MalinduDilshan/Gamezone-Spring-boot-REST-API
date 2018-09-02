package com.gamezone.controller;

import com.gamezone.common.DateMapper;
import com.gamezone.common.TerminalStatusUtils;
import com.gamezone.entity.Computer;
import com.gamezone.entity.Terminal;
import com.gamezone.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
        Terminal terminal = new Terminal();

        terminal.setAssignTime(DateMapper.toSqlDate(new Date()));
        terminal.setDuration(0);
        terminal.setLeftTime(DateMapper.toSqlDate(new Date()));
        terminal.setProgressValue(0);
        terminal.setPowerCut(false);
        terminal.setStatus(TerminalStatusUtils.OFFLINE);
        terminal.setComputer(computer);

        computer.setTerminal(terminal);
        return computerRepository.save(computer);
    }

    @Override
    public Computer findById(long id) {
        return computerRepository.findByPrimaryKey(id);
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
