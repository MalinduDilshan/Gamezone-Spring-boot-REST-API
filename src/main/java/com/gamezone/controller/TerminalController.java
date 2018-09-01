package com.gamezone.controller;

import com.gamezone.entity.Terminal;
import org.springframework.stereotype.Component;

@Component
public interface TerminalController {
    Iterable<Terminal> findAll();
    Terminal save(Terminal terminal);
    void update(Terminal terminal);
    void delete(long id);
    void deleteByComputerId(long id);
}
