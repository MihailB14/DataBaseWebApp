package com.postgresql.demo.repo;

import com.postgresql.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface PersonRepo extends JpaRepository<Person, Long> {
}
