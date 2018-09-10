package com.gamezone.controller;

import com.gamezone.entity.TerminalDetail;
import org.springframework.stereotype.Component;

@Component
public interface TerminalDetailController {
    Iterable<TerminalDetail> findAll();
    TerminalDetail save(TerminalDetail terminalDetail);
    void update(TerminalDetail terminalDetail);
    void delete(long id);
}
