package com.gamezone.restcontrollers;

import com.gamezone.common.CommonUtils;
import com.gamezone.entity.Computer;
import com.gamezone.entity.Terminal;
import com.gamezone.service.TerminalService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Terminal")
public class TerminalControllers {

    @Autowired
    private TerminalService terminalService;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})

    @ApiOperation(value = "View a list of available terminals", response = Terminal.class)
    @CrossOrigin
    @GetMapping(produces = CommonUtils.APPLICATION_TYPE)
    public Iterable<Terminal> list(){
        return terminalService.findAll();
    }

    @ApiOperation(value = "Save a terminal", response = Terminal.class)
    @CrossOrigin
    @PostMapping(produces = CommonUtils.APPLICATION_TYPE)
    public ResponseEntity save(@RequestBody Terminal terminal){
        return new ResponseEntity(terminalService.save(terminal), HttpStatus.ACCEPTED);
    }

    @ApiOperation(value = "Update a terminal", response = Terminal.class)
    @CrossOrigin
    @PutMapping(produces = CommonUtils.APPLICATION_TYPE)
    public ResponseEntity update(@RequestBody Terminal terminal){
        terminalService.update(terminal);
        return new ResponseEntity(terminal, HttpStatus.ACCEPTED);
    }

    @ApiOperation(value = "Delete a terminal by Computer Id", response = Terminal.class)
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        terminalService.delete(id);
    }
}
