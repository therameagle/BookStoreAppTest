package com.bookstore.utilities;

import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.yaml.snakeyaml.serializer.NumberAnchorGenerator;

//import the package
import io.restassured.response.Response;

//This class is used for variable declaration
public class Globals {

	public static Response response;
	public static List<String> isbnNumbers;
	public static String username = "pro"+numGen()+"@gmail.com";
	public static String password = "pass"+numGen();
	public static String userId;
	public static String token;
	protected static final Logger logger = LogManager.getLogger();

	static String numGen() {
		Random random = new Random();
		String numbers = "1234567890";
		return String.valueOf(random.nextInt(numbers.length()));
	}
}
