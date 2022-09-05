package com.project.SpringBootHibernate.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Data

public class TeamDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teamId;
    private String teamName;
    private String owner;
    private String moduleOwned;
    private List<Long> memberIds;
}
