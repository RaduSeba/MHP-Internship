package com.mhp.Internship.demo.repo;

import com.mhp.Internship.demo.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<MovieEntity,Long> {
}
