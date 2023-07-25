package com.mhp.Internship.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="episode")
public class EpisodeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="episode_number")
    private String episodeNr;

    @Column(name="release_date")
    private LocalDateTime releaseDate;

    @Column(name="air_date")
    private LocalDateTime airDate;

    @Column(name="platform")
    private String platform;
    @Column(name="country")
    private String country;


}
