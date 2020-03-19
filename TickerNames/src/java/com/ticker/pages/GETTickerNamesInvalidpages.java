package com.emp.pages;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GET_Emp_Invalid_pages {

	static Response response;

	public static void GetBaseURI_400() {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "http://dummy.restapiexample.com";
	}

	public static void GetCountryAPIRequest() {
		RestAssured.basePath = "/api/v1/employyyees";
		response = given().when().get();
		System.out.println("Get Response for India :-" + response.asString());
	}

	public static Response GetCreateCountryAPIRequest(int id) {
		
		System.out.println("Path formwd is ::"+"/api/v1/employee/" + id);
		RestAssured.basePath = "/api/v1/employee/" + id;
		Response res = given().when().get();
		//System.out.println("Get Response for India :-" + res.asString());
		return res;
	}

	public static void ValidateCountryAPIResponse() {
		JsonPath json = new JsonPath(response.asString());

		try {
			System.out.println("Started to validate the Indian langauge and calling code");
			Assert.assertEquals(404, response.statusCode());

			// System.out.println("Indian Langauge is ->>"+
			// json.get("[1].languages[0].name"));
			//
			// System.out.println("**************************");
			//
			// Assert.assertEquals("91", json.getString("[1].callingCodes[0]"));
			// System.out.println("India calling code is ->>"+
			// json.getString("[1].callingCodes[0]"));
			//
			// System.out.println("Successfully validated the Indian langauge as
			// Hindi and calling code as 91");
		}
		// }
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to validate the Indian langauge as Hindi and calling code as 91");
		}

	}
}
