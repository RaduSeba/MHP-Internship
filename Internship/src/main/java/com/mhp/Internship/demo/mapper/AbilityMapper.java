package com.mhp.Internship.demo.mapper;

import com.mhp.Internship.demo.dto.AbilityDto;
import com.mhp.Internship.demo.entity.AbilityEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AbilityMapper {

    AbilityDto entityToDto(AbilityEntity entity);
    AbilityEntity DtoToEntity(AbilityDto dto);

    List<AbilityDto > entitiesToDtos(List<AbilityEntity> entities);

    List<AbilityEntity> dtosToEntities(List<AbilityDto> dtos);

}
