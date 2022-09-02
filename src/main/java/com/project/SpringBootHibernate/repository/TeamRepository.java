package com.project.SpringBootHibernate.repository;

import com.project.SpringBootHibernate.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
