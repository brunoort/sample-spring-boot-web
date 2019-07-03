package br.com.institutointegra.sample.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.institutointegra.sample.model.Person;
import br.com.institutointegra.sample.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonResource {

	@Autowired
	private PersonService personService;

	@GetMapping("/all")
	public List<Person> getAll(){
		return this.personService.getAll();
	}
	
	@PostMapping("/")
	public Person save(@RequestBody Person person) {
		return this.personService.save(person);
	}
	
	@PutMapping("/{id}")
	public Person update(
			@PathVariable(name = "id", required = false) Long idPerson, 
			@RequestBody Person person
			) {
		return this.personService.save(person);
	}
	
}
