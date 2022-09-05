package com.project.SpringBootHibernate.controller;

import com.project.SpringBootHibernate.dto.TeamDto;
import com.project.SpringBootHibernate.entity.Team;

import com.project.SpringBootHibernate.service.MemberService;
import com.project.SpringBootHibernate.service.TeamService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@Data
@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;



    @PostMapping(value = "/saveTeam",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Team>saveTeam(
            @RequestBody TeamDto teamDto){
                Team persistedTeam = teamService.save(teamDto);

                return  new ResponseEntity<>(persistedTeam, HttpStatus.CREATED);
    }



    @GetMapping(value = "/getTeam/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<Team>getTeam(
            @PathVariable final  Long id
    ){
       Team persistedTeam = teamService.getById(id) ;

       return  new ResponseEntity<>(persistedTeam, HttpStatus.CREATED);
    }



    @PutMapping(value = "/updateTeams/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Team>updateTeam(
            @PathVariable("teamId") Long id,
            @RequestBody TeamDto teamDto
    ){
        Team persistedTeam= teamService.update(id, teamDto);

        return  new ResponseEntity<>(persistedTeam, HttpStatus.OK);
    }
    }


