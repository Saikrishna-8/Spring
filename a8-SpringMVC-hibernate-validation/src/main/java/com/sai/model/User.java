package com.sai.model;

import org.hibernate.validator.constraints.Range;

public class User {
	
	@Range(min=5,max=10)
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
