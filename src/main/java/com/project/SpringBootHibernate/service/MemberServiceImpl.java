package com.project.SpringBootHibernate.service;


import com.project.SpringBootHibernate.entity.Member;
import com.project.SpringBootHibernate.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveMember(Member member){
        return memberRepository.save(member);
    }

    @Override
    public List<Member>fetchMemberList(){
        return(List<Member>) memberRepository.findAll();
    }

    @Override
    public Void deleteMemberById(Long memId) {
        memberRepository.deleteById(memId);
        return null;
    }


}
