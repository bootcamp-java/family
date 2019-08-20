package com.family.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.family.model.Family;

@Repository
public interface FamilyRepository extends MongoRepository<Family, String>{

	public List<Family> findByfullName(String fullName);
	public List<Family> findBydni(int dni);
}
