package com.gamezone.gamezone;

import com.gamezone.service.ComputerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComputerTest {

    @Autowired
    ComputerService computerService;

    @Test
    public void contextLoads() {
        System.out.println("List of computers size :"+computerService.findAll().size());
    }
}
