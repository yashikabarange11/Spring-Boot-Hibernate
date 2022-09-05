package com.project.SpringBootHibernate.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class MemberDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memId;
    private String memName;
    private String emailId;
    private String role;
    private String permissionLevel;

}
