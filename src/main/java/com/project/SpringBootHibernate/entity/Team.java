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
@Table(name = "TeamTable")

public class Team {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long teamId;
    private String teamName;
    private String owner;
    private String moduleOwned;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,
                    CascadeType.MERGE
    })
    @JoinTable(
            name = "team_members",
            joinColumns = {@JoinColumn(
                    name = "team_Id",
                    referencedColumnName = "teamId"

            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "mem_Id",
                    referencedColumnName = "memId"

            )}
    )

    private Set<Member>members = new HashSet<>();


    /*@OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(
             name = "team_id",
         referencedColumnName = "teamId"
     )

     private List<Instance> instances;*/


}
