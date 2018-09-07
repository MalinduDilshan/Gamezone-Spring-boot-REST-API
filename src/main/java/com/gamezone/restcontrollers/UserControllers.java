package com.gamezone.restcontrollers;

import com.gamezone.common.CommonUtils;
import com.gamezone.entity.User;
import com.gamezone.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserControllers {

    @Autowired
    private UserService userService;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})

    @ApiOperation(value = "View a list of available users", response = User.class)
    @CrossOrigin
    @GetMapping(produces = CommonUtils.APPLICATION_TYPE)
    public Iterable<User> list(){
        return userService.findAll();
    }

    @ApiOperation(value = "Save a user", response = User.class)
    @CrossOrigin
    @PostMapping(produces = CommonUtils.APPLICATION_TYPE)
    public ResponseEntity save(@RequestBody User user){
        return new ResponseEntity(userService.save(user), HttpStatus.OK);
    }

    @ApiOperation(value = "Find user by id", response = User.class)
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable long id){
        return new ResponseEntity(userService.findById(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Update a user", response = User.class)
    @CrossOrigin
    @PutMapping(produces = CommonUtils.APPLICATION_TYPE)
    public ResponseEntity update(@RequestBody User user){
        userService.update(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a user", response = User.class)
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        userService.delete(id);
    }

}
