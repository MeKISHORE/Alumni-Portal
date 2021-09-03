package com.alumni.jnv.service;

import java.util.List;

import com.alumni.jnv.models.MobileDetails;

public interface MobileService {

	MobileDetails saveMobile(MobileDetails mobile);
	List<MobileDetails> getAllMobiles();

}
