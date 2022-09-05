package com.project.SpringBootHibernate.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;



import javax.persistence.*;
import java.util.HashSet;
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
    @Column(name = "id")
    private Long id;
    private String teamName;
    private String owner;
    private String moduleOwned;

    @ManyToMany
    @JoinTable(
            name = "team_members",
            joinColumns = @JoinColumn(
                    name = "team_Id",
                    referencedColumnName = "id"

            ),
            inverseJoinColumns = @JoinColumn(
                    name = "mem_Id",
                    referencedColumnName = "memId"

            )
    )
    @JsonManagedReference
    private Set<Member>members = new HashSet<>();



}
