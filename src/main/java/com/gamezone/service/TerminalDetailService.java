package com.gamezone.service;

import com.gamezone.entity.TerminalDetail;
import org.springframework.stereotype.Component;

@Component
public interface TerminalDetailService {
    Iterable<TerminalDetail> findAll();
    TerminalDetail save(TerminalDetail terminalDetail);
    void update(TerminalDetail terminalDetail);
    void delete(long id);
}