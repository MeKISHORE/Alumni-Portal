package com.alumni.jnv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumni.jnv.models.PersonDetails;

public interface PersonDetailsRepository extends JpaRepository<PersonDetails, Long> {

}
