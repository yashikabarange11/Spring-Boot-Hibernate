package com.project.SpringBootHibernate.controller;


import com.project.SpringBootHibernate.entity.Member;
import com.project.SpringBootHibernate.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/saveMember")

    public Member saveMember(
        @Validated @RequestBody Member member
    ){
        return memberService.saveMember(member);
    }

    @GetMapping("/getMember")

    public List<Member> fetchMemberList()
    {
        return memberService.fetchMemberList();
    }

    @DeleteMapping("/deleteMember{id}")

    public String deleteMemberById(@PathVariable("id")Long memId)
    {
        memberService.deleteMemberById(memId);
        return "Deleted Successfully!";
    }

}
