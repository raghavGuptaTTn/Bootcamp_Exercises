package com.spring.jpa.relationships.onetoone.repos;

import com.spring.jpa.relationships.onetoone.entities.Licence;
import org.springframework.data.repository.CrudRepository;

public interface LicenceRepository extends CrudRepository<Licence, Integer> {

}
