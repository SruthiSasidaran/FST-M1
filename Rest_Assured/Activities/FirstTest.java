package examples;



import org.testng.Assert;
import org.testng.annotations.Test;

import au.com.dius.pact.consumer.dsl.Matcher;
import au.com.dius.pact.consumer.dsl.Matchers;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;

@Test
public class FirstTest {
	// GET https://petstore.swagger.io/v2/pet/findByStatus?status=sold
	
	public void getRequestWithQueryParam() {
		
		//Send request and Save response
		
		
				RestAssured.given().
				baseUri("https://petstore.swagger.io/v2/pet").
				header("Content-Type", "application/json"). //Request content type
				queryParam("status","sold").
				when().
				get("/findByStatus");
		
		//Print the status code
		//System.out.println(response.statusCode());
		//System.out.println("========");
		
		//Print the response headers
		//System.out.println(response.getheaders().aslist());
		//System.out.println("========");
		
		//Print the response body
		//System.out.println(response.getbody().asString());
		//System.out.println("========");
		//System.out.println(response.getbody().asPrettyString());
		
		Validatable<ValidatableResponse, Response> response;
		//Extract properties from the response
		String perStatus = response.then().extract().path("[0].status");
		
		//Assertions
		Assert.assertEquals(perStatus, "sold");
		
		//Restassured.Assertions
		response.then().
		statusCode(200).
		body("[0].status", Matchers.equalTo("sold")).
		body("[0].name", Matchers.equalTo("doggie"));
		    
	}
	
	
		
	


	// GET https://petstore.swagger.io/v2/pet/{petId}
	
	public void getRequestWithPathParam() {
		// Send request, get response, and assert
		RestAssured.given().
			baseUri("https://petstore.swagger.io/v2/pet").
			header("Content-Type", "application/json"). // Request content type
			pathParam("petId", 13).
		when().
			get("/{petId}").  // get("/13")
		then().
			statusCode(200).
			body("status", Matchers.equalTo("as")).
			body("name", Matchers.equalTo("a"));
	}
	}
