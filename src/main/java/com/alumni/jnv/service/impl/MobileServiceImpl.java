package com.alumni.jnv.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alumni.jnv.models.MobileDetails;
import com.alumni.jnv.repository.MobileRepository;
import com.alumni.jnv.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {
	
	private MobileRepository mobileRepository;

	public MobileServiceImpl(MobileRepository mobileRepository) {
		super();
		this.mobileRepository = mobileRepository;
	}
	
	@Override
	public MobileDetails saveMobile(MobileDetails mobile) {
		return mobileRepository.save(mobile);
	}

	@Override
	public List<MobileDetails> getAllMobiles() {
		return mobileRepository.findAll();
	}
	
	
	
	
	
	
}
