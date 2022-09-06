package com.project.SpringBootHibernate.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

import java.util.HashSet;
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
    @JsonBackReference
    private  Set<Team> team = new HashSet<>();


}
