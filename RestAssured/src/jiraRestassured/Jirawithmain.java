package jiraRestassured;

import Files.stringToJson;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class Jirawithmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="http://localhost:8080";
		SessionFilter SF=new SessionFilter();
		String SessionDetails = RestAssured.given().log().all().filter(SF).header("Content-Type","application/json")
		.body("{ \"username\": \"dubeyarpit02\", \"password\": \"Pass@arpit123\" }")
		.when().post("rest/auth/1/session").then().log().all().extract().response().asString();
		
		/*JsonPath js = stringToJson.strToJson(SessionDetails);
		String value=js.get("session.value");
		System.out.println(value);*/
		System.out.println("Value for SF is " + SF);
		String Response = RestAssured.given().log().all().header("Content-Type","application/json").header("Key","RES")
				.body("{\r\n" + 
						"    \"fields\": {\r\n" + 
						"        \"project\": {\r\n" + 
						"            \"id\": \"10009\",\r\n" + 
						"            \"Key\": \"RES\"\r\n" + 
						"        },\r\n" + 
						"        \"summary\": \"My first issue\",\r\n" + 
						"        \"issuetype\": {\r\n" + 
						"            \"name\": \"Bug\"\r\n" + 
						"        },\r\n" + 
						"        \"description\": \"This is my first bug reported in jira for restassured training\"\r\n" + 
						"    }\r\n" + 
						"}").filter(SF)
				.when().post("/rest/api/2/issue").then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		System.out.println("Response is "+Response);
	}

}
