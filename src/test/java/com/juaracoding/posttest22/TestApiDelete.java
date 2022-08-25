package com.juaracoding.posttest22;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class TestApiDelete {
	@Test
	public void TestDelete() {
		
		when()
		.delete("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(204)
		.log().all();
		
	}


}
