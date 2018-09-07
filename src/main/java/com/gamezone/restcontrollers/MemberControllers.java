package com.gamezone.restcontrollers;

import com.gamezone.common.CommonUtils;
import com.gamezone.entity.Member;
import com.gamezone.service.MemberService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/Member")
public class MemberControllers {

    @Autowired
    private MemberService memberService;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})

    @ApiOperation(value = "View a list of available members", response = Member.class)
    @CrossOrigin
    @GetMapping(produces = CommonUtils.APPLICATION_TYPE)
    public Iterable<Member> list() {
        return memberService.findAll();
    }

    @ApiOperation(value = "Save a member", response = Member.class)
    @CrossOrigin
    @PostMapping(produces = CommonUtils.APPLICATION_TYPE)
    public ResponseEntity save(@RequestBody Member member) {
        return new ResponseEntity(memberService.save(member), HttpStatus.OK);
    }

    @ApiOperation(value = "Find member by id", response = Member.class)
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable long id) {
        return new ResponseEntity(memberService.findById(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Update a member", response = Member.class)
    @CrossOrigin
    @PutMapping(produces = CommonUtils.APPLICATION_TYPE)
    public ResponseEntity update(@RequestBody Member member) {
        memberService.update(member);
        return new ResponseEntity(member, HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a member", response = Member.class)
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        memberService.delete(id);
    }

    @ApiOperation(value = "Delete a member", response = Member.class)
    @CrossOrigin
    @PostMapping("/{memberId}")
    public ResponseEntity savePhoto(@PathVariable("memberId") long memberId,
                                    @RequestParam("profilePicture") MultipartFile profilePicture) throws IOException {
        Member response = null;
        if(profilePicture != null){
            response = new Member();
            response.setPhoto(profilePicture.getBytes());
            memberService.update(response);
            return new ResponseEntity(response, HttpStatus.OK);
        }
        else{
            return new ResponseEntity(response, HttpStatus.NO_CONTENT);
        }
    }
}
