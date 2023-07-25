package com.mhp.Internship.demo.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
public class CharacterSimpleDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
}
