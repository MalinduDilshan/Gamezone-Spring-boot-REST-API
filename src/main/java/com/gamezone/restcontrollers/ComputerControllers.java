package com.gamezone.restcontrollers;

import com.gamezone.common.CommonUtils;
import com.gamezone.entity.Computer;
import com.gamezone.service.ComputerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/Computer")
public class ComputerControllers {

    @Autowired
    private ComputerService computerService;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})

    @ApiOperation(value = "View a list of available computers", response = Computer.class)
    @CrossOrigin
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = CommonUtils.APPLICATION_TYPE)
    public Iterable<Computer> list(){
        return computerService.findAll();
    }

    @ApiOperation(value = "Save a computer", response = Computer.class)
    @CrossOrigin
    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = CommonUtils.APPLICATION_TYPE)
    public void save(Computer computer){
        computerService.save(computer);
    }
}
