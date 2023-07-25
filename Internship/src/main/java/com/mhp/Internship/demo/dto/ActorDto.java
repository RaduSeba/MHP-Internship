package com.mhp.Internship.demo.dto;

import com.mhp.Internship.demo.entity.MovieEntity;
import lombok.Data;

import java.util.Set;
@Data
public class ActorDto extends ActorSimpleDto {

    private Set<MovieEntity> movies;
}
