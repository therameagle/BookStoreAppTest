package com.bookstore.services;
//import the package
import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

/* 
 * This class is used to check for 
 * Update the functionality of record using PUT Method
*/
public class UpdateBook extends Globals {
	public void updateBook() {
		logger.info("User need to verify for the Update the existing book");
		System.out.println("User need to verify for the Update the existing book");
		String body = "{ \"userId\":" + userId + "," + "  \"isbn\": \"" + isbnNumbers.get(1) + "}";
		response = RestAssured.given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.header("Authorization", "Bearer " + token)
				.pathParam("isbn", isbnNumbers.get(0)).and().body(body)
				.when()
				.log()
				.all()
				.put("/BookStore/v1/Books/{isbn}")
				.prettyPeek();
	}
// Validate the response using assert
	public void validateThatBookIsUpdated() {
		// assert status code
		Assert.assertEquals(200, response.statusCode());
		// validate userId and username
		Assert.assertEquals(userId, response.path("userId"));
		Assert.assertEquals(username, response.path("username"));
		// validate isbn number
		Assert.assertEquals(isbnNumbers.get(1), response.path("books[0].isbn"));
	}
}
