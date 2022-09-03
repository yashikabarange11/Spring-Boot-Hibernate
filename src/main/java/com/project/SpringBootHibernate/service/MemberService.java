package com.project.SpringBootHibernate.service;

import com.project.SpringBootHibernate.dto.MemberDto;
import com.project.SpringBootHibernate.entity.Member;

import java.util.List;

public interface MemberService {
     Member saveMember(MemberDto memberDto) ;

     List<Member> all() ;

    Member getOne(Long memId);

}
