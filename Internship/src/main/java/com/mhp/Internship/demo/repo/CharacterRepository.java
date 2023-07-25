package com.mhp.Internship.demo.repo;

import com.mhp.Internship.demo.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity,Long> {
}
