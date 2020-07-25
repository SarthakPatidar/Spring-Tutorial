package com.learning.springpractice.mvc;

import java.util.List;

// import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private List<String> operatingSystems;

	/*
	 * private LinkedHashMap<String, String> countryOptions;
	 */

	public Student() {

		/*
		 * countryOptions = new LinkedHashMap<String, String>();
	     * countryOptions.put("IN", "India");
		 * countryOptions.put("BR", "Brazil");
		 * countryOptions.put("FR", "France");
		 * countryOptions.put("GE", "Germany");
		 * countryOptions.put("US", "USA");
		 */
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public List<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	/*
	 * public LinkedHashMap<String, String> getCountryOptions() {
	 * 	 return countryOptions;
	 * }
	 */
}
