package com.example.myconfact.repository;

import com.example.myconfact.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByBlockIsNull();

    List<Person> findByName(String name);
}
