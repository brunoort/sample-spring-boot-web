package br.com.institutointegra.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.institutointegra.sample.model.Person;
import br.com.institutointegra.sample.repository.PersonRepository;
import br.com.institutointegra.sample.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public List<Person> getAll() {
		return this.personRepository.findAll();
	}

	@Override
	public Person save(Person p) {
		return this.personRepository.save(p);
	}

	@Override
	public Person findById(Long id) {
		return this.personRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		this.personRepository.deleteById(id);
	}

}
