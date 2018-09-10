package com.gamezone.restcontrollers;

import com.gamezone.common.CommonUtils;
import com.gamezone.entity.TerminalDetail;
import com.gamezone.service.TerminalDetailService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/TerminalDetails")
public class TerminalDetailControllers {

    @Autowired
    private TerminalDetailService terminalDetailService;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})

    @ApiOperation(value = "View a list of available terminal details", response = TerminalDetail.class)
    @CrossOrigin
    @GetMapping(produces = CommonUtils.APPLICATION_TYPE)
    public Iterable<TerminalDetail> list(){
        return terminalDetailService.findAll();
    }

    @ApiOperation(value = "Save a terminal detail", response = TerminalDetail.class)
    @CrossOrigin
    @PostMapping(produces = CommonUtils.APPLICATION_TYPE)
    public ResponseEntity save(@RequestBody TerminalDetail terminalDetail){
        return new ResponseEntity(terminalDetailService.save(terminalDetail), HttpStatus.OK);
    }

    @ApiOperation(value = "Update a terminal detail", response = TerminalDetail.class)
    @CrossOrigin
    @PutMapping(produces = CommonUtils.APPLICATION_TYPE)
    public ResponseEntity update(@RequestBody TerminalDetail terminalDetail){
        terminalDetailService.update(terminalDetail);
        return new ResponseEntity(terminalDetail, HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a terminal detail by id", response = TerminalDetail.class)
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        terminalDetailService.delete(id);
    }
}
