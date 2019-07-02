package br.com.institutointegra.sample.service;

import java.util.List;

import br.com.institutointegra.sample.model.Person;

public interface PersonService {
	List<Person> getAll();
	
	Person save(Person p);
	
	Person findById(Long id);
	
	void delete(Long id);
}
