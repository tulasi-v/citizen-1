package com.citizen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citizen.model.Citizen;
import com.citizen.repository.CitizenRepo;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private  CitizenRepo repo;
	
	
	@PostMapping
	public Citizen add(@RequestBody Citizen model) {
		
		Citizen save = repo.save(model);
		
		return save;
	}

}
