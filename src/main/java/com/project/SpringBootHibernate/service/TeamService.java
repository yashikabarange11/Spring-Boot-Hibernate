package com.project.SpringBootHibernate.service;

import com.project.SpringBootHibernate.entity.Team;

import java.util.List;

public interface TeamService {
    Team saveTeam(Team team);

    List<Team> fetchTeamList();

    Team updateTeam(Team team, Long teamId);


}
