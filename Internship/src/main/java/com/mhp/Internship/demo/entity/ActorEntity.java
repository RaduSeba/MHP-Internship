package com.mhp.Internship.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name="actor")
public class ActorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Integer age;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "movieactor",
            joinColumns = @JoinColumn(name = "actor_fk"),
            inverseJoinColumns = @JoinColumn(name = "movie_fk"))
    Set<MovieEntity> movies;
}
