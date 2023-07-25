package com.mhp.Internship.demo.dto;

import com.mhp.Internship.demo.entity.ActorEntity;
import lombok.Data;

import java.util.Set;

@Data
public class MovieDto extends MovieSimpleDto{

    Set<ActorEntity> actors;
}
