package com.mhp.Internship.demo.repo;

import com.mhp.Internship.demo.entity.TriviaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TriviaRepository extends JpaRepository<TriviaEntity,Long> {
}
