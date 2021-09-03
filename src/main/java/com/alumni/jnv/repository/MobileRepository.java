package com.alumni.jnv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumni.jnv.models.MobileDetails;

public interface MobileRepository extends JpaRepository<MobileDetails, Long> {
	
}
