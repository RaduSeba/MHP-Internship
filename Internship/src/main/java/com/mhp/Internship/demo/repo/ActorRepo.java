package com.mhp.Internship.demo.repo;

import com.mhp.Internship.demo.entity.ActorEntity;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepo extends JpaRepository<ActorEntity,Long> {
}
