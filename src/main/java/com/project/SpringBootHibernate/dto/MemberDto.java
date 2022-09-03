package com.project.SpringBootHibernate.dto;

import lombok.Data;

@Data
public class MemberDto {
    private String memName;
    private String emailId;
    private String role;
    private String permissionLevel;

}
