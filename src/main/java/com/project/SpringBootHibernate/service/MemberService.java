package com.project.SpringBootHibernate.service;

import com.project.SpringBootHibernate.entity.Member;

import java.util.List;

public interface MemberService {
     Member saveMember(Member member) ;

     List<Member> fetchMemberList() ;

    Void deleteMemberById(Long memId) ;

}
