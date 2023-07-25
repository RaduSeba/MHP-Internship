package com.mhp.Internship.demo.repo;

import com.mhp.Internship.demo.entity.EpisodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeRepository  extends JpaRepository<EpisodeEntity,Long> {

    List<EpisodeEntity>  findByPlatformAndCountry(String country, String platform);

    List<EpisodeEntity>  findByPlatform( String platform);

    List<EpisodeEntity>  findByCountry(String country);



}
