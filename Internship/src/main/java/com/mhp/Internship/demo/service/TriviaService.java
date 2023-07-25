package com.mhp.Internship.demo.service;

import com.mhp.Internship.demo.dto.TriviaDto;
import com.mhp.Internship.demo.entity.EpisodeEntity;
import com.mhp.Internship.demo.entity.TriviaEntity;
import com.mhp.Internship.demo.mapper.TriviaMapper;
import com.mhp.Internship.demo.repo.TriviaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TriviaService {

    private TriviaMapper triviaMapper;

    private TriviaRepository triviaRepository;

    public TriviaService(TriviaMapper triviaMapper, TriviaRepository triviaRepository) {
        this.triviaMapper = triviaMapper;
        this.triviaRepository = triviaRepository;
    }

    public List<TriviaDto> getAll(){

        List<TriviaEntity> entities= triviaRepository.findAll();
        List<TriviaDto> dtos = triviaMapper.entitiesToDtos(entities);

        return  dtos;

    }

    public TriviaDto addTrivia(TriviaDto dto){

        TriviaEntity entity = triviaMapper.dtoToEntity(dto);

        TriviaEntity e =triviaRepository.save(entity);

        TriviaDto dto2 = triviaMapper.entityToDto(e);

        return  dto2;
    }

    public void updateDescription(Long id, String description){

       TriviaEntity entity = triviaRepository.findById(id).orElse(null);

       entity.setDescription(description);

       triviaRepository.save(entity);


    }

    public void delete(Long id){

        triviaRepository.deleteById(id);
    }

    public void update(TriviaDto dto){

        TriviaEntity entity= triviaMapper.dtoToEntity(dto);

        triviaRepository.save(entity);
    }
}
