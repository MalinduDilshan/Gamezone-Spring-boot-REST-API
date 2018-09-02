package com.gamezone.restcontrollers;

import com.gamezone.common.CommonUtils;
import com.gamezone.entity.Computer;
import com.gamezone.service.ComputerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(produces = CommonUtils.APPLICATION_TYPE)
    public Iterable<Computer> list(){
        return computerService.findAll();
    }

    @ApiOperation(value = "Save a computer", response = Computer.class)
    @CrossOrigin
    @PostMapping(produces = CommonUtils.APPLICATION_TYPE)
    public ResponseEntity save(@RequestBody Computer computer){
        return new ResponseEntity(computerService.save(computer), HttpStatus.ACCEPTED);
    }

    @ApiOperation(value = "Find computer by id", response = Computer.class)
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable long id){
        return new ResponseEntity(computerService.findById(id), HttpStatus.ACCEPTED);
    }

    @ApiOperation(value = "Update a computer", response = Computer.class)
    @CrossOrigin
    @PutMapping(produces = CommonUtils.APPLICATION_TYPE)
    public ResponseEntity update(@RequestBody Computer computer){
        computerService.update(computer);
        return new ResponseEntity(computer, HttpStatus.ACCEPTED);
    }

    @ApiOperation(value = "Delete a computer", response = Computer.class)
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        computerService.delete(id);
    }
}
