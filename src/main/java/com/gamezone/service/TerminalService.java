package com.gamezone.service;

import com.gamezone.entity.Terminal;
import org.springframework.stereotype.Component;

@Component
public interface TerminalService {
    Iterable<Terminal> findAll();
    Terminal save(Terminal terminal);
    void update(Terminal terminal);
    void delete(long id);
}
