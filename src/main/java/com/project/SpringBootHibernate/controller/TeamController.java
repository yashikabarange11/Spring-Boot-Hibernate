package com.project.SpringBootHibernate.controller;

import com.project.SpringBootHibernate.entity.Team;
import com.project.SpringBootHibernate.service.MemberService;
import com.project.SpringBootHibernate.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;
    private MemberService memberService;

    @PostMapping("/saveTeam")
    public Team saveTeam(
            @Validated @RequestBody Team team
    ){
        return teamService.saveTeam(team);
    }

    @GetMapping("/getTeam")
    public List<Team> fetchTeamList()

    {
        return teamService.fetchTeamList();
    }

    @PutMapping("{team_id}/updateTeams/{id}")
    public Team updateTeam(@RequestBody Team team,
                           @PathVariable("team_id") Long teamId,
                            @PathVariable("id")Long memId)
    {
        return teamService.updateTeam(
                team, teamId
        );
    }

}
