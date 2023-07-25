package com.mhp.Internship.demo.mapper;

import com.mhp.Internship.demo.dto.TriviaDto;
import com.mhp.Internship.demo.entity.TriviaEntity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface TriviaMapper {

    TriviaDto entityToDto(TriviaEntity entity);

    List<TriviaDto> entitiesToDtos(List<TriviaEntity> entities);

    TriviaEntity dtoToEntity(TriviaDto dto);
}
