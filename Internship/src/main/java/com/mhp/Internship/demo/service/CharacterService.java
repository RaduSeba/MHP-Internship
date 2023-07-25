package com.mhp.Internship.demo.service;

import com.mhp.Internship.demo.dto.CharacterDto;
import com.mhp.Internship.demo.dto.CharacterSimpleDto;
import com.mhp.Internship.demo.entity.AbilityEntity;
import com.mhp.Internship.demo.entity.CharacterEntity;
import com.mhp.Internship.demo.mapper.AbilityMapper;
import com.mhp.Internship.demo.mapper.CharacterMapper;
import com.mhp.Internship.demo.repo.CharacterRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    private final AbilityMapper abilityMapper;

    public CharacterService(CharacterRepository characterRepository, CharacterMapper characterMapper,AbilityMapper abilityMapper) {
        this.characterRepository = characterRepository;
        this.characterMapper = characterMapper;
        this.abilityMapper=abilityMapper;
    }

    public List<CharacterDto> getAllCharacters(){
        List<CharacterEntity> entityList = characterRepository.findAll();
        List<CharacterDto> dtos = characterMapper.entitiestoDtos(entityList);

        return  dtos;
    }

    public List<CharacterDto> getSorted(){
        Sort sort = Sort.by("firstName").ascending();
        List<CharacterEntity> entities = characterRepository.findAll(sort);
        List<CharacterDto> dtos = characterMapper.entitiestoDtos(entities);

        return dtos;
    }

    public CharacterDto save(CharacterDto dto){

        CharacterEntity entity = characterMapper.dtoToEntity(dto);

        CharacterEntity savedCharacter = characterRepository.save(entity);

        return characterMapper.entityToDto(savedCharacter);
    }

    public List<CharacterSimpleDto> getAllSimplifiedList(){
        return characterMapper.toSimpleDtos(characterRepository.findAll());
    }

    public boolean deleteById(Long id){

        if(characterRepository.findById(id).isEmpty()){
            return false;
        }
        characterRepository.deleteById(id);

        return true;

    }

    public CharacterDto updateCharacter(CharacterDto dto){
        Optional<CharacterEntity> o = characterRepository.findById(dto.getId());
        if(o.isPresent()){
            CharacterEntity entity = o.get();
            entity.setAge(dto.getAge());
            entity.getAbilities().clear();
            List<AbilityEntity> abilityEntities = abilityMapper.dtosToEntities(dto.getAbilities());
            entity.getAbilities().addAll(abilityEntities);
           // entity.setAbilities(dto.getAbilities());
            characterRepository.save(entity);
            return characterMapper.entityToDto(entity);
        }

        return null;

    }
}
