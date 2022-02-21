package com.sai.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;


public class User {
	
	@Size(min=5,max=10,message="Your name should be between 5 - 10 characters.")
	private String name;
	
	private String country,introduction,visitedCountries[];
	

	public String getCountry() {
		return country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String[] getVisitedCountries() {
		return visitedCountries;
	}
	public void setVisitedCountries(String visitedCountries[]) {
		this.visitedCountries = visitedCountries;
	}
}
