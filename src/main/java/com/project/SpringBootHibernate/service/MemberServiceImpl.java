package com.project.SpringBootHibernate.service;


import com.project.SpringBootHibernate.dto.MemberDto;
import com.project.SpringBootHibernate.entity.Member;
import com.project.SpringBootHibernate.repository.MemberRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service

public class MemberServiceImpl implements MemberService {
    @Autowired
    private  MemberRepository memberRepository;


    @Override
    public Member saveMember(@NotNull MemberDto memberDto) {

        Member member = new Member();
        member.setMemName(memberDto.getMemName());
        member.setEmailId(memberDto.getEmailId());
        member.setRole(memberDto.getEmailId());
        member.setPermissionLevel(memberDto.getPermissionLevel());

        return memberRepository.save(member);
    }

    @Override
    public List<Member> all() {
        return memberRepository.findAll();
    }

    @Override
    @Deprecated
    public Member getOne(Long memId) {
        return memberRepository.getOne(memId);
    }
}
