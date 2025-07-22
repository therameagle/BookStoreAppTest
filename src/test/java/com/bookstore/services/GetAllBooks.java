package com.bookstore.services;
//import the Package
import org.junit.Assert;

import com.bookstore.utilities.Globals;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
/* 
 * This class is used to check for 
 * get all the book using GET method
*/
public class GetAllBooks extends Globals {
    public void getAllBooks() {
    	logger.info("User need to verify for the Get All Books");
    	System.out.println("User need to verify for the Get All Books");
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .when().log().all()
                .get("/BookStore/v1/Books")
                .prettyPeek();
    }
 //Validate the response using assert
    public void validateThatAllBooksAreListed() {
        //assert status code
        Assert.assertEquals(200, response.statusCode());
        //get the data from body
        isbnNumbers = response.path("books.isbn");
        //assert that all isbn numbers are not null
        isbnNumbers.forEach(number -> Assert.assertNotNull(number));
        isbnNumbers.forEach(Assert::assertNotNull);
        for (String isbnNumber : isbnNumbers) {
            Assert.assertNotNull(isbnNumber);
        }
    }
}
