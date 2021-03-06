package com.learning.springpractice.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.learning.springpractice.mvc.validation.CourseCode;

@Component
public class Customer {
	private String firstName;
	
	@CourseCode(value="TOPS", message="must start with TOPS")
	private String courseCode;
	
	@NotNull(message = "is required")
	@Min(value=1, message="must be greater than or equal to zero")
	@Max(value=10, message="must be lesser than or equal to 10")
	private Integer freePasses;

	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@Pattern(regexp ="^[a-zA-Z0-9]{5}", message="only 5 chars/digits allowed")
	private String postalCode;

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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
