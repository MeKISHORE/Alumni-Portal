package com.alumni.jnv.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumni.jnv.models.MobileDetails;
import com.alumni.jnv.service.MobileService;

@RestController
@RequestMapping("/api/mobiles")
public class MobilesController {
	
	private MobileService mobileService;

	public MobilesController(MobileService mobileService) {
		super();
		this.mobileService = mobileService;
	}
	
	@PostMapping
	public ResponseEntity<MobileDetails> saveMobile(@RequestBody MobileDetails mobile){
		return new ResponseEntity<MobileDetails>(mobileService.saveMobile(mobile), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<MobileDetails>> getMobile(){
		return new ResponseEntity<List<MobileDetails>>(mobileService.getAllMobiles(),HttpStatus.FOUND);
	}
}
