package com.gamezone.controller;

import com.gamezone.entity.TerminalDetail;
import com.gamezone.repository.TerminalDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminalDetailControllerImpl implements TerminalDetailController {

    @Autowired
    private TerminalDetailRepository terminalDetailRepository;

    @Override
    public Iterable<TerminalDetail> findAll() {
        return terminalDetailRepository.findAll();
    }

    @Override
    public TerminalDetail save(TerminalDetail terminalDetail) {
        return terminalDetailRepository.save(terminalDetail);
    }

    @Override
    public void update(TerminalDetail terminalDetail) {
        terminalDetailRepository.save(terminalDetail);
    }

    @Override
    public void delete(long id) {
        terminalDetailRepository.deleteById(id);
    }

    @Override
    public Iterable<TerminalDetail> findByComputerId(long id) {
        return terminalDetailRepository.findByComputer_PrimaryKey(id);
    }

    @Override
    public Iterable<TerminalDetail> findByMemberId(long id) {
        return terminalDetailRepository.findByMember_PrimaryKey(id);
    }

    @Override
    public Iterable<TerminalDetail> findByUserId(long id) {
        return terminalDetailRepository.findByUser_PrimaryKey(id);
    }
}
