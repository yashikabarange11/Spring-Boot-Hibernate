package com.project.SpringBootHibernate.service;


import com.project.SpringBootHibernate.entity.Team;
import com.project.SpringBootHibernate.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Team saveTeam(Team team){
        return teamRepository.save(team);
    }

    @Override
    public List<Team> fetchTeamList(){
        return (List<Team>)
                teamRepository.findAll();

    }

    @Override
    public Team updateTeam(Team team, Long teamId) {
        Team teamDB = teamRepository.findById(teamId).get();

        /*if (Objects.nonNull(team.getTeamName())
                && !"".equalsIgnoreCase(team.getTeamName())
        ) {
            teamDB.setTeamName(team.getTeamName());
        }
        if(Objects.nonNull(team.getOwner())
        && !"".equalsIgnoreCase((team.getOwner()))
        ){
            teamDB.setOwner(team.getOwner());
        }
        if(Objects.nonNull(team.getModuleOwned())
        && !"".equalsIgnoreCase(team.getModuleOwned())
        ){
            teamDB.setModuleOwned(team.getModuleOwned());
        }
        if(Objects.nonNull(team.getMembers())
        && !"".equalsIgnoreCase(team.getMembers().toString()))
        {
            teamDB.setMembers(team.getMembers());
        }
        if(Objects.nonNull(team.getInstances())
        && !"".equalsIgnoreCase(team.getInstances().toString()))
        {
            teamDB.setInstances(team.getInstances());
        }*/
    return teamRepository.save(teamDB);
    }

}






