package com.api;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class GetAPICall {
	
	@Given("I want to call the Get API")
	public void i_want_to_call_the_Get_API() {
	    System.out.println("...I want to call the Get API...");
	    RestAssured.baseURI = "https://rahulshettyacademy.com";
		Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .param("key", "qaclick123")
                .param("place_id", "d7558fc6b405ba1ca8bd048d296aaf7e")
                .when()
                .get("/maps/api/place/get/json")
                .then()
                .extract().response();
				System.out.println(response.statusCode());
		Assert.assertEquals(response.statusCode(),200);
		
		System.out.println(response.getBody().asString());
		JsonPath jsnpath1=response.jsonPath();		
		System.out.println("Location : "+ jsnpath1.get("location"));
		
		//JsonPath jsnpath2=jsnpath1.get("location");
		System.out.println("latitude : "+ jsnpath1.get("location.latitude"));

	}

}
