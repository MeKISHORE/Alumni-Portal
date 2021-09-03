package com.alumni.jnv.service.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.alumni.jnv.exception.ResourceNotFoundException;
import com.alumni.jnv.models.PersonDetails;
import com.alumni.jnv.repository.PersonDetailsRepository;
import com.alumni.jnv.service.PersonDetailsService;

@Service
public class PersonDetailsServiceImpl implements PersonDetailsService {

	private PersonDetailsRepository personDetailsRepository;
	
	public PersonDetailsServiceImpl(PersonDetailsRepository personDetailsRepository) {
		super();
		this.personDetailsRepository = personDetailsRepository;
	}

	@Override
	public List<PersonDetails> getAllPersonDetails() {
		return personDetailsRepository.findAll();
	}

	@Override
	public PersonDetails savePersonDetail(PersonDetails personDetails) {
		personDetails.setPersonStatus(true);
		return personDetailsRepository.save(personDetails);
	}
	
	@Override
	public PersonDetails updatePersonDetails(PersonDetails personDetails) {
		PersonDetails existingPersonDetails = personDetailsRepository.findById(personDetails.getPersonId()).orElseThrow(
				() -> new ResourceNotFoundException("personDetails", "PersonId", personDetails.getPersonId()));
		existingPersonDetails.setPersonName(personDetails.getPersonName());
		existingPersonDetails.setPersonBatch(personDetails.getPersonBatch());
		existingPersonDetails.setPersonAdd(personDetails.getPersonAdd());
		existingPersonDetails.setPersonCity(personDetails.getPersonCity());
		existingPersonDetails.setPersonCurrentCity(personDetails.getPersonCurrentCity());
		existingPersonDetails.setPersonCurrentStatus(personDetails.getPersonCurrentStatus());
		return personDetailsRepository.save(existingPersonDetails);
	}

	@Override
	public PersonDetails deletePersonDetails(PersonDetails personDetails) {
		PersonDetails existingPersonDetails = personDetailsRepository.findById(personDetails.getPersonId()).orElseThrow(
				() -> new ResourceNotFoundException("personDetails", "PersonId", personDetails.getPersonId()));
		existingPersonDetails.setPersonStatus(false);
		return personDetailsRepository.save(existingPersonDetails);
	}
	

	
}
