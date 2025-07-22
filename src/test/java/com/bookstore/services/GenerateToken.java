package com.bookstore.services;
//import the Package
import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;
/* 
 * This class is used to check for 
 * generating the token using POST method
*/
public class GenerateToken extends Globals {
//Generate the Token
    public void generateToken(){
    	logger.info("User need to verify for the Generate Token");
    	System.out.println("User need to verify for the Generate Token");
        String body = "{\n" +
                "  \"userName\": \""+username+"\",\n" +
                "  \"password\": \""+password+"\"\n" +
                "}";
//Collect the response from generateToken API
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(body).log().all()
                .when()
                .post("/Account/v1/GenerateToken")
                .prettyPeek();
    }
//Validate the response using assert
    public void validateTokenIsGenerated(){
        //assert status code
        Assert.assertEquals(200, response.statusCode());
        //get the token and assign it to a global variable
        token = response.path("token");
        //Assert that response body contains status and its value is Success
        Assert.assertEquals("Success", response.path("status"));
    }
}
