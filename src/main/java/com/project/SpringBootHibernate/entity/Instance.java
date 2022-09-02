package com.project.SpringBootHibernate.entity;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
@Table(name = "InstanceTable")
public class Instance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO
    )
    private Long insId;
    private String insName;
    private String state;



}
