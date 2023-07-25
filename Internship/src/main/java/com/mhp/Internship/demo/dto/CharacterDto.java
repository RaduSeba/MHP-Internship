package com.mhp.Internship.demo.dto;

import lombok.Data;

import java.util.List;
@Data
public class CharacterDto extends CharacterSimpleDto{

    private List<AbilityDto> abilities;
}
