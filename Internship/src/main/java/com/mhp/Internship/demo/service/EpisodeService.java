package com.mhp.Internship.demo.service;

import com.mhp.Internship.demo.dto.EpisodeDto;
import com.mhp.Internship.demo.entity.EpisodeEntity;
import com.mhp.Internship.demo.mapper.EpisodeMapper;
import com.mhp.Internship.demo.repo.EpisodeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodeService {

    private final EpisodeRepository episodeRepository;

    private final EpisodeMapper episodeMapper;

    public EpisodeService(EpisodeRepository episodeRepository, EpisodeMapper episodeMapper) {
        this.episodeRepository = episodeRepository;
        this.episodeMapper = episodeMapper;
    }

    public List<EpisodeDto> getEpisodes(){
        List<EpisodeEntity> entities = episodeRepository.findAll();
        List<EpisodeDto> dtos = episodeMapper.entitiesToDtos(entities);

        return  dtos;
    }

    public EpisodeDto addEpisode(EpisodeDto dto){

        EpisodeEntity entity = episodeMapper.dtoToEntity(dto);

        EpisodeEntity e = episodeRepository.save(entity);

        EpisodeDto dto2 = episodeMapper.entityToDto(e);

        return dto2;
    }

    public List<EpisodeDto> findCountry(String country){

        List<EpisodeEntity> entities = episodeRepository.findByCountry(country);
        List<EpisodeDto> dtos = episodeMapper.entitiesToDtos(entities);

        return  dtos;
    }

    public List<EpisodeDto> findPlatform(String platform){

        List<EpisodeEntity> entities = episodeRepository.findByPlatform(platform);
        List<EpisodeDto> dtos = episodeMapper.entitiesToDtos(entities);

        return  dtos;
    }

    public List<EpisodeDto> findPlatformAndCountry(String platform,String country){

        List<EpisodeEntity> entities = episodeRepository.findByPlatformAndCountry(platform,country);
        List<EpisodeDto> dtos = episodeMapper.entitiesToDtos(entities);

        return  dtos;
    }

    public void deleteById(Long id){
        episodeRepository.deleteById(id);
    }

    public void update(EpisodeDto dto){
        EpisodeEntity entity = episodeMapper.dtoToEntity(dto);

        episodeRepository.save(entity);
    }
}
