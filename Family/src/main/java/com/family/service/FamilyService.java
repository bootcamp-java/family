package com.family.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.model.Family;
import com.family.repository.FamilyRepository;

@Service
public class FamilyService {
	
	@Autowired
	private FamilyRepository familyRepository;
	
	//Create operation
	public Family create(Family family) {
		return familyRepository.save(family);
	}
	
	//Retrieve Operation
	public List<Family> getAll(){
		return familyRepository.findAll();
	}
	
	public List<Family> getByFullName(String fullName) {
		return familyRepository.findByfullName(fullName);
	}
	
	//Update Operation
	public Family update(Family family) {
		return familyRepository.save(family);
	}
	
	//Delete Operation
	public void deleteAll() {
		familyRepository.deleteAll();
	}
	
	public void delete(String id) {
		familyRepository.deleteById(id);
	}
}
