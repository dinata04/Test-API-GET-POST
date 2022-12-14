package com.juaracoding.posttest21;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPost {
	
	@Test
	public void TestPost() {
//		
		JSONObject request = new JSONObject();
		request.put("name", "Bootcamp");
		request.put("category", "Katalon");
		System.out.println(request.toJSONString());
		
		given()
		.header("content-type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(201)
		.log().all();
		
	}
	

}
