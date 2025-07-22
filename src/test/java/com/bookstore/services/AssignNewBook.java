package com.bookstore.services;
//import the Package
import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;
/* 
 * This class is used to check for 
 * Checking that particular book is assigned using POST Method
*/
public class AssignNewBook extends Globals {
	public void assignNewBook() {
		logger.info("Assign a new book to the user");
		System.out.println("Assign a new book to the user");
		String body = "{\"userId\": \"%s\"," + "\"collectionOfIsbns\": ["
				+ "{\"isbn\": \"%s\"}]}".formatted(userId, isbnNumbers.get(0));

		response = RestAssured.given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.and()
				.header("Authorization", "Bearer " + token)
				.body(body)
				.when()
				.log()
				.all().post("/BookStore/v1/Books")
				.prettyPeek();
		System.out.println("@@@response " +response);
	}

	// Validate the response using assert
	public void validateThatBookIsAssigned() {
		// assert status code
		Assert.assertEquals(201, response.statusCode());
		// validate that isbn number is correct
		String actualIsbn = response.path("books.isbn[0]");
		Assert.assertEquals(isbnNumbers.get(0), actualIsbn);
	}
}
