package com.spring.security.security.demo.repositories;

import com.spring.security.security.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findPersonByUsername(String username);
}
