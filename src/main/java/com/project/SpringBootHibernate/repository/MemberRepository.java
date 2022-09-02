package com.project.SpringBootHibernate.repository;

import com.project.SpringBootHibernate.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {


}
