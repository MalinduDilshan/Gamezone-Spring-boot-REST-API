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

    }

}
