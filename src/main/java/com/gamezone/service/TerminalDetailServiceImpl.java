package com.gamezone.service;

import com.gamezone.controller.TerminalDetailController;
import com.gamezone.entity.TerminalDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminalDetailServiceImpl implements TerminalDetailService{

    @Autowired
    private TerminalDetailController terminalDetailController;

    private static TerminalDetailService INSTANCE = null;

    public static TerminalDetailService getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new TerminalDetailServiceImpl();
        }
        return INSTANCE;
    }

    public static void setINSTANCE(TerminalDetailService INSTANCE) {
        TerminalDetailServiceImpl.INSTANCE = INSTANCE;
    }

    private TerminalDetailServiceImpl() {
    }

    @Override
    public Iterable<TerminalDetail> findAll() {
        return terminalDetailController.findAll();
    }

    @Override
    public TerminalDetail save(TerminalDetail terminalDetail) {
        return terminalDetailController.save(terminalDetail);
    }

    @Override
    public void update(TerminalDetail terminalDetail) {
        terminalDetailController.save(terminalDetail);
    }

    @Override
    public void delete(long id) {
        terminalDetailController.delete(id);
    }
}
