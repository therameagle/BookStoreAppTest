package com.bookstore.services;
//import the Package
import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;
import java.util.HashMap;
import java.util.Map;
/* 
 * This class is used to check for 
 * deleting functionality of record using DELETE Method
*/
public class DeleteBook extends Globals {
//Delete the record for Book using DELETE Method
    public void deleteAnExistingBook() {
    	logger.info("User need to verify for the Delete an existing book");
    	System.out.println("User need to verify for the Delete an existing book");
        Map<String, Object> map = new HashMap<>();
        map.put("isbn", isbnNumbers.get(1));
        map.put("userId", userId);
        response = RestAssured
                .given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(map).log().all()
                .when()
                .delete("/BookStore/v1/Book")
                .prettyPeek();
    }
//Validate the response using assert
    public void validateBookIsRemoved() {
        //validate status code is 204
        Assert.assertEquals(response.statusCode(), 204);
    }
}