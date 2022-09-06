package com.project.SpringBootHibernate.service;

import com.project.SpringBootHibernate.dto.TeamDto;
import com.project.SpringBootHibernate.entity.Team;

import java.util.List;

public interface TeamService {
    Team save(TeamDto team);
    Team getById(Long id);

    Team update(Long id, TeamDto teamDto);


}
