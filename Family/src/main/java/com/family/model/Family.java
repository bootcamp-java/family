package com.family.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "family")
public class Family {

	@Id
	String id;
	String idStudent;
	String fullName;
	String gender;
	LocalDate birthDate;
	String relationship;
	String documentType;
	int dni;

	public Family(String idStudent, String fullName, String gender, LocalDate birthDate, String relationship, String documentType, int dni) {
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.relationship = relationship;
		this.documentType = documentType;
		this.dni = dni;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getDocumentType() {
		return documentType;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String ToString() {
		return "Family ID: "+id+" Student ID:"+idStudent+" Full Name:"+fullName+" Gender:"+gender+" Fecha de Nacimiento:" +birthDate+" Document Type:"+documentType+" DNI:"+dni;
	}	
}
