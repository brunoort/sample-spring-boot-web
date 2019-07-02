package br.com.institutointegra.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.institutointegra.sample.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	
}
