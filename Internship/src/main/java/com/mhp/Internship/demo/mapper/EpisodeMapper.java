package com.mhp.Internship.demo.mapper;

import com.mhp.Internship.demo.dto.EpisodeDto;
import com.mhp.Internship.demo.entity.EpisodeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EpisodeMapper {


    EpisodeDto entityToDto(EpisodeEntity entity);

    List<EpisodeDto> entitiesToDtos(List<EpisodeEntity> entities);

    EpisodeEntity dtoToEntity(EpisodeDto dto);
}
