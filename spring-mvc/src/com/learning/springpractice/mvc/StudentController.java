package com.learning.springpractice.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// create a student object
		Student theStudent = new Student();

		// add student object as model attribute
		theModel.addAttribute("student", theStudent);

	    // add the country options to the model
	    theModel.addAttribute("theCountryOptions", countryOptions);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {

		// Print the firstName and lastName to console.
		System.out.println("FirstName = "+ theStudent.getFirstName());
		System.out.println("LastName = "+ theStudent.getLastName());
		//System.out.println("Country = "+ theStudent.getCountry());

		return "student-confirmation";
	}
}
