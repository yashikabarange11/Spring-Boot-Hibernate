package com.project.SpringBootHibernate.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
@Table(name = "MemberTable")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memId;
    private String memName;
    private String emailId;
    private String role;
    private String permissionLevel;



    @ManyToMany(mappedBy = "members")
    private Set<Team> teams = new HashSet<>();


}
