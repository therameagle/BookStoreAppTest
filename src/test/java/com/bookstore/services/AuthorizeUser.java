package com.bookstore.services;

//import the Package
import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

/* 
 * This class is used to check for 
 * Authorizing the user using POST Method
*/
public class AuthorizeUser extends Globals {
	public void authorizeUser() {
		logger.info("User need to verify for the Authorize User");
		System.out.println("User need to verify for the Authorize User");
		String body = "{ \"userName\": \"%s\",\"password\": \"%s\" }".
				formatted(username, password);
		response = RestAssured.given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(body)
				.log()
				.all()
				.when()
				.post("/Account/v1/Authorized")
				.prettyPeek();
	}

	// Validate the response using assert
	public void validateThatUserIsAuthorized() {
		// assert status code
		Assert.assertEquals(200, response.statusCode());
		// validate response body
		Assert.assertTrue(response.body().asString().equals("true"));
	}
}
