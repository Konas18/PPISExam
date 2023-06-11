package com.ppis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "entity1")
public class Entity1 {

    public Entity1() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "p1", nullable = false, length = 1000)
    private String p1;
    
    @Column(name = "p2", nullable = false, length = 1000)
    private String p2;

    @Column(name = "p3", nullable = false)
    private Integer p3;

}
