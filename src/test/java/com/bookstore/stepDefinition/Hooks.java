package com.bookstore.stepDefinition;

import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {
	@Before
	public void setUp() {
		RestAssured.baseURI = "https://bookstore.toolsqa.com";
	}
}
