package com.project.SpringBootHibernate.controller;


import com.project.SpringBootHibernate.dto.MemberDto;
import com.project.SpringBootHibernate.entity.Member;
import com.project.SpringBootHibernate.service.MemberService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Data
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping(value = "/saveMember",produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Member>saveMember(
            @RequestBody MemberDto memberDto
            ){
        Member persistedMember = memberService.saveMember(memberDto);
        return  new ResponseEntity<>(persistedMember, HttpStatus.CREATED);
    }

    @GetMapping(value = "/getMember",produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<Member>>getMember(){
        return  new ResponseEntity<>(memberService.all(), HttpStatus.CREATED);
    }

}
