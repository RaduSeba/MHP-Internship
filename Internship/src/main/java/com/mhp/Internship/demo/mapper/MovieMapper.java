package com.mhp.Internship.demo.mapper;

import com.mhp.Internship.demo.dto.MovieDto;
import com.mhp.Internship.demo.entity.MovieEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    MovieEntity dtoToEntity(MovieDto dto);

    MovieDto entitytoDto(MovieEntity entity);
    List<MovieDto> entitiesToDto(List<MovieEntity> entityList);

}
