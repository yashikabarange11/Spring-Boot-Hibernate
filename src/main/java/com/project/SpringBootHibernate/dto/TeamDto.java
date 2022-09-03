package com.project.SpringBootHibernate.dto;

import lombok.Data;

import java.util.List;
@Data

public class TeamDto {
    private String teamName;
    private String owner;
    private String moduleOwned;
    private List<Long> memberIds;
}
