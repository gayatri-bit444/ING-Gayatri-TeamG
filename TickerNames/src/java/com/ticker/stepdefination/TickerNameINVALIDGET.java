package com.emp.stepdefination;

import com.emp.pages.GET_Emp_Invalid_pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EMP_INVALID_GET {
	
	@Given("GetBase URL to validate for Get Operations")
	public void getbase_URL_to_validate_for_Get_Operations() {
	  GET_Emp_Invalid_pages.GetBaseURI_400();
	}

	@When("send the Request for Get Operations")
	public void send_the_Request_for_Get_Operations() {
		 GET_Emp_Invalid_pages.GetCountryAPIRequest();
	   
	}

	@Then("Valdate incorrect details for the Get Operations")
	public void valdate_incorrect_details_for_the_Get_Operations() {
		 GET_Emp_Invalid_pages.ValidateCountryAPIResponse();
	}




}
