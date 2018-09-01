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

        Computer computer = new Computer();
        computer.setComputerName("PC 01");
        computer.setIpAddress("192.168.8.101");
        computerService.save(computer);
        System.out.println("Computer Saved");

        List<Computer> computerList = new ArrayList<>();
        for(Computer computerObj : computerService.findAll()){
            computerList.add(computerObj);
        }
        System.out.println("List of computers size :"+computerList.size());


        computer = computerList.get(0);
        computer.setComputerName("PC 02");

        computerService.update(computer);
        System.out.println("Computer Updated");

        computerService.delete(computer.getPrimaryKey());
        System.out.println("Computer Deleted");
    }
}
