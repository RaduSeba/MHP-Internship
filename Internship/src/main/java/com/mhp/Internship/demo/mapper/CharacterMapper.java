package com.mhp.Internship.demo.mapper;

import com.mhp.Internship.demo.dto.CharacterDto;
import com.mhp.Internship.demo.dto.CharacterSimpleDto;
import com.mhp.Internship.demo.entity.CharacterEntity;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CharacterMapper {

    CharacterEntity dtoToEntity(CharacterDto dto);
    CharacterDto entityToDto(CharacterEntity entity);

    List<CharacterDto> entitiestoDtos(List<CharacterEntity> entities);

    @Named("simpleDto")
    CharacterSimpleDto entityToSimple(CharacterEntity entity);


    @IterableMapping(qualifiedByName = "simpleDto")
    List<CharacterSimpleDto> toSimpleDtos(List<CharacterEntity> entities);
}
