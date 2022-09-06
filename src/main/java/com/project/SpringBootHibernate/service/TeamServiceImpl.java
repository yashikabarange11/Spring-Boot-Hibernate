package com.project.SpringBootHibernate.service;


import com.project.SpringBootHibernate.dto.TeamDto;
import com.project.SpringBootHibernate.entity.Member;
import com.project.SpringBootHibernate.entity.Team;
import com.project.SpringBootHibernate.repository.MemberRepository;
import com.project.SpringBootHibernate.repository.TeamRepository;
import lombok.Data;


import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Data

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private  TeamRepository teamRepository;

    @Autowired
    private  MemberRepository memberRepository;


    @Override
    @Transactional
    @Deprecated

    public Team save(@NotNull TeamDto teamDto) {



        String teamName = teamDto.getTeamName();
        String owner = teamDto.getOwner();
        String moduleOwned = teamDto.getModuleOwned();

        Team team = new Team();
        team.setTeamName(teamName);
        team.setOwner(owner);
        team.setModuleOwned(moduleOwned);

        List<Member>memberProxies = new ArrayList<>();

        for(Long memId : teamDto.getMemberIds()){
            Member tempMember = memberRepository.getOne(memId);
            memberProxies.add(tempMember);
        }
        team.setMembers(new HashSet<>(memberProxies));


        return teamRepository.save(team);
    }

    @Override
    public Team getById(Long id) {
        //noinspection OptionalGetWithoutIsPresent
        return teamRepository.findById(id).get();
    }

    @Override
    @Deprecated
    public Team update(Long id, @NotNull TeamDto teamDto) {
        String teamName = teamDto.getTeamName();
        String owner = teamDto.getOwner();
        String moduleOwned = teamDto.getModuleOwned();

        Team team = new Team();
        team.setTeamName(teamName);
        team.setOwner(owner);
        team.setModuleOwned(moduleOwned);
        team.setId(id);

        List<Member>memberProxies = new ArrayList<>();

        for(Long memId : teamDto.getMemberIds()){
            Member tempMember = memberRepository.getOne(memId);
            memberProxies.add(tempMember);
        }
        team.setMembers(new HashSet<>(memberProxies));


        return teamRepository.save(team);
    }
}






