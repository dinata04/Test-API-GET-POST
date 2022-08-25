package com.juaracoding.posttest22;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestApiPut {
	

	@Test
	public void TestPut() {
		
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
		.put("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(200)
		.log().all();
		
	}
	

}
