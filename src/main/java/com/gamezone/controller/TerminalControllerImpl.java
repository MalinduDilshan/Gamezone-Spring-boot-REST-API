package com.gamezone.controller;

import com.gamezone.entity.Terminal;
import com.gamezone.repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminalControllerImpl implements TerminalController{

    @Autowired
    private TerminalRepository terminalRepository;

    @Override
    public Iterable<Terminal> findAll() {
        return terminalRepository.findAll();
    }

    @Override
    public Terminal save(Terminal terminal) {
        return terminalRepository.save(terminal);
    }

    @Override
    public void update(Terminal terminal) {
        terminalRepository.save(terminal);
    }

    @Override
    public void delete(long id) {
        terminalRepository.deleteById(id);
    }

    @Override
    public void deleteByComputerId(long id) {
        terminalRepository.deleteByComputerId(id);
    }
}
