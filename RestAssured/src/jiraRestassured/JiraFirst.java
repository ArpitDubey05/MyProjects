package jiraRestassured;

//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Files.stringToJson;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

//import static io.restassured.RestAssured.*;

public class JiraFirst {
	
	/*@BeforeTest
	public SessionFilter login()
	{
		RestAssured.baseURI="http://localhost:8080";
		SessionFilter SF=new SessionFilter();
		String SessionDetails = RestAssured.given().log().all().filter(SF).header("Content-Type","application/json")
		.body("{ \"username\": \"dubeyarpit02\", \"password\": \"Pass@arpit123\" }")
		.when().post("rest/auth/1/session").then().log().all().extract().response().asString();
		
		System.out.println("Session Details " + SessionDetails);
		
		return SF;
	}*/

	
	@Test
	public void createissue()
	{
		//RestAssured.baseURI="http://localhost:8080";
		//SF=login();
		
		RestAssured.baseURI="http://localhost:8080";
		SessionFilter SF=new SessionFilter();
		String SessionDetails = RestAssured.given().log().all().filter(SF).header("Content-Type","application/json")
		.body("{ \"username\": \"dubeyarpit02\", \"password\": \"Pass@arpit123\" }")
		.when().post("rest/auth/1/session").then().log().all().extract().response().asString();
		
		JsonPath js = stringToJson.strToJson(SessionDetails);
		String value=js.get("session.value");
		System.out.println(value);
		
		String Response = RestAssured.given().log().all().header("Content-Type","application/json").header("SESSIONID",value)
				.body("{\r\n" + 
						"    \"fields\": {\r\n" + 
						"        \"project\": {\r\n" + 
						"            \"id\": \"20000\",\r\n" + 
						"            \"Key\": \"JIR\"\r\n" + 
						"        },\r\n" + 
						"        \"summary\": \"My first issue through automation\",\r\n" + 
						"        \"issuetype\": {\r\n" + 
						"            \"name\": \"Bug\"\r\n" + 
						"        },\r\n" + 
						"        \"description\": \"This is my first bug reported in jira for restassured training\"\r\n" + 
						"    }\r\n" + 
						"}")
				.when().post("/rest/api/2/issue").then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		System.out.println(Response);
		
	}
}
