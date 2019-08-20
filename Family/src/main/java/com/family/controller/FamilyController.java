package com.family.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.family.model.Family;
import com.family.service.FamilyService;

@RestController
@RequestMapping("/Family")
public class FamilyController {

	@Autowired
	private FamilyService familyService;
	
	//Create new family
	@PostMapping("/create")
	public Family create(@RequestBody Family family) {
		return familyService.create(family);
	}
	
	//Get for name
	@GetMapping("/get/{fullName}")
	public List<Family> getFamily(@PathVariable("fullName") String fullName){
		return familyService.getByFullName(fullName);
	}
	
	//Get All
	@GetMapping("/getAll")
	public List<Family> getAll(){
		return familyService.getAll();
	}
	
	//Update student
	@PutMapping("/update")
	public Family update(@RequestBody Family family) {
		return familyService.update(family);
	}
	
	//Delete for ID
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") String id) {
		familyService.delete(id);
		return "Deleted "+id;
	}
	
	//Delete All
	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		familyService.deleteAll();
		return "Deleted All";
	}
}






