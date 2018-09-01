package com.gamezone.service;

import com.gamezone.controller.TerminalController;
import com.gamezone.entity.Terminal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private TerminalController terminalController;

    private static TerminalService INSTANCE = null;

    public static TerminalService getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new TerminalServiceImpl();
        }
        return INSTANCE;
    }

    public static void setINSTANCE(TerminalService INSTANCE) {
        TerminalServiceImpl.INSTANCE = INSTANCE;
    }

    private TerminalServiceImpl() {
    }


    @Override
    public Iterable<Terminal> findAll() {
        return terminalController.findAll();
    }

    @Override
    public Terminal save(Terminal terminal) {
        return terminalController.save(terminal);
    }

    @Override
    public void update(Terminal terminal) {
        terminalController.save(terminal);
    }

    @Override
    public void delete(long id) {
        terminalController.delete(id);
    }

    @Override
    public void deleteByComputerId(long id) {
        terminalController.deleteByComputerId(id);
    }
}
