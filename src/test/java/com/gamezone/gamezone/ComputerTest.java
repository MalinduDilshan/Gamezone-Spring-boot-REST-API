package com.gamezone.gamezone;

import com.gamezone.entity.Computer;
import com.gamezone.service.ComputerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComputerTest {

    @Autowired
    ComputerService computerService;

    @Test
    public void contextLoads() {

        List<Computer> computerList = new ArrayList<>();
        for(Computer computer : computerService.findAll()){
            computerList.add(computer);
        }
        System.out.println("List of computers size :"+computerList.size());


//        Computer computer = computerList.get(0);
//        computer.setComputer_name("PC 01");
//
//        computerService.update(computer);
//        System.out.println("Updated");

//        computerService.delete(1);
//        System.out.println("Deleted");
    }
}
