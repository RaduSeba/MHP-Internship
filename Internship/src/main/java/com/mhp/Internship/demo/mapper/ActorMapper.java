package com.mhp.Internship.demo.mapper;

import com.mhp.Internship.demo.dto.AbilityDto;
import com.mhp.Internship.demo.dto.ActorDto;
import com.mhp.Internship.demo.entity.AbilityEntity;
import com.mhp.Internship.demo.entity.ActorEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ActorMapper {

    ActorEntity dtoToEntity(ActorDto dto);

    ActorDto entityToDto(ActorEntity entity);

    List<ActorDto> entitiesToDto(List<ActorEntity> entity);
}
