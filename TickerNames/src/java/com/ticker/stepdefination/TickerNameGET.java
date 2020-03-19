package com.emp.stepdefination;

import com.emp.pages.GET_Emp_Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Emp_GET {
	
	@Given("GetBase URL for Get Operations")
	public void getbase_URL_for_Get_Operations() {
		
		GET_Emp_Pages.GetBaseURI();
	}
	    
	

	@When("Send the Request for Get Operations")
	public void send_the_Request_for_Get_Operations() {
		
		GET_Emp_Pages.GetCountryAPIRequest();
	   
	}

	@Then("Validate the Get Operations")
	public void validate_the_Get_Operations() {
		
		
		GET_Emp_Pages.ValidateCountryAPIResponse();
	
	}

}
