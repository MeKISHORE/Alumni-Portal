package com.alumni.jnv.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumni.jnv.models.PersonDetails;
import com.alumni.jnv.service.PersonDetailsService;

@RestController
@RequestMapping("/api/Person")
public class PersonDetailsController {

	PersonDetailsService personDetailsService;

	public PersonDetailsController(PersonDetailsService personDetailsService) {
		super();
		this.personDetailsService = personDetailsService;
	}
	
	@GetMapping
	public ResponseEntity<List<PersonDetails>> getAllPerson(){
		return new ResponseEntity<List<PersonDetails>>(personDetailsService.getAllPersonDetails(),HttpStatus.FOUND);
	}
	
	@PostMapping
	public ResponseEntity<PersonDetails> savePersonDetails(@RequestBody PersonDetails personDetails){
		return new ResponseEntity<PersonDetails>(personDetailsService.savePersonDetail(personDetails),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<PersonDetails> updatePersonDetails(@RequestBody PersonDetails personDetails){
		return new ResponseEntity<PersonDetails>(personDetailsService.updatePersonDetails(personDetails),HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<PersonDetails> deletePersonDetails(@RequestBody PersonDetails personDetails){
		return new ResponseEntity<PersonDetails>(personDetailsService.deletePersonDetails(personDetails),HttpStatus.OK);
	}
	
	
}
