package com.alumni.jnv.service;

import java.util.List;

import com.alumni.jnv.models.PersonDetails;

public interface PersonDetailsService {

	List<PersonDetails> getAllPersonDetails();
	PersonDetails savePersonDetail(PersonDetails personDetails);
	PersonDetails updatePersonDetails(PersonDetails personDetails);
	PersonDetails deletePersonDetails(PersonDetails personDetails);
}
