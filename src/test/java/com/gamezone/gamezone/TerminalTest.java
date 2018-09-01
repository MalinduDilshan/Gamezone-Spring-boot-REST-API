package com.gamezone.gamezone;

import com.gamezone.entity.Terminal;
import com.gamezone.service.TerminalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TerminalTest {

    @Autowired
    TerminalService terminalService;

    @Test
    public void contextLoads() {

        Terminal terminal = new Terminal();

        List<Terminal> terminalList = new ArrayList<>();
        for (Terminal terminalObj : terminalService.findAll()) {
            terminalList.add(terminalObj);
        }
        System.out.println("List of terminals size :" + terminalList.size());


//        terminal = terminalList.get(0);
//        terminal.setProgressValue(100);
//
//        terminalService.update(terminal);
//        System.out.println("Terminal Updated");
//
//        terminalService.deleteByComputerId(terminal.getComputerId());
//        System.out.println("Terminal Deleted");
    }

}
