package com.bookstore.services;
// import the Package
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import com.bookstore.utilities.Globals;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
/* 
 * This class is used to check for 
 * add the book using POST Method
*/
public class AddNewUser extends Globals {
    Faker faker = new Faker();
    public void addNewUser() {
    	logger.info("User need to verify for the Add new User");
    	System.out.println("User need to verify for the Add new User");
        username = "singhamcooler@gmail.com";
        password = "PassW0rd@123";;
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("userName", username);
        bodyMap.put("password", password);
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(bodyMap)
                .when().log().all()
                .post("/Account/v1/User")
                .prettyPeek();
    }

	// Validate the response using assert
	public void validateThatUserPosted() {
		// assert status code
		Assert.assertEquals(201, response.statusCode());
		// get userId from body
		userId = response.path("userID");
		// assert that username is correct
		Assert.assertEquals(username, response.path("username"));
	}
}
