package com.mhp.Internship.demo.service;

import com.mhp.Internship.demo.dto.ActorDto;
import com.mhp.Internship.demo.dto.CharacterDto;
import com.mhp.Internship.demo.entity.ActorEntity;
import com.mhp.Internship.demo.entity.CharacterEntity;
import com.mhp.Internship.demo.mapper.ActorMapper;
import com.mhp.Internship.demo.mapper.MovieMapper;
import com.mhp.Internship.demo.repo.ActorRepo;
import com.mhp.Internship.demo.repo.MovieRepo;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

   private final ActorRepo actorRepo;

   private final ActorMapper actorMapper;

   private final MovieRepo movieRepo;

   private final MovieMapper movieMapper;

    public ActorService(ActorRepo actorRepo, ActorMapper actorMapper, MovieRepo movieRepo, MovieMapper movieMapper) {
        this.actorRepo = actorRepo;
        this.actorMapper = actorMapper;
        this.movieRepo = movieRepo;
        this.movieMapper = movieMapper;
    }
    public ActorDto save(ActorDto dto){

        ActorEntity actorEntity = actorMapper.dtoToEntity(dto);

        ActorEntity savedEntity = actorRepo.save(actorEntity);

        return actorMapper.entityToDto(savedEntity);
    }

}
