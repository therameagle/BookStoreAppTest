package com.bookstore.stepDefinition;
//import the package
import io.cucumber.java.Before;
import io.restassured.RestAssured;
/* 
 * This class is used to 
 * Set and configure the prerequisite data
*/
public class Hooks {
	@Before
	public void setUp() {
		RestAssured.baseURI = "https://bookstore.toolsqa.com";
	}
}
