package jiraRestassured;

import java.io.File;

import org.testng.Assert;

import Files.stringToJson;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class AddComment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		RestAssured.baseURI="http://localhost:8080";
		SessionFilter SF=new SessionFilter();
		RestAssured.given().log().all().filter(SF).header("Content-Type","application/json")
		.body("{ \"username\": \"dubeyarpit02\", \"password\": \"Pass@arpit123\" }")
		.when().post("rest/auth/1/session").then().log().all().extract().response().asString();
		
		
		System.out.println("Value for SF is " + SF);
		String Response = RestAssured.given().pathParam("Key", "10004").log().all().header("Content-Type","application/json").header("Key","RES")
				.body("{\r\n" + 
						"    \"body\": \"comment\",\r\n" + 
						"    \"visibility\": {\r\n" + 
						"        \"type\": \"role\",\r\n" + 
						"        \"value\": \"Administrators\"\r\n" + 
						"    }\r\n" + 
						"}").filter(SF)
				.when().post("/rest/api/2/issue/{Key}/comment").then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		System.out.println("Response is "+Response);
		
		JsonPath js=new JsonPath(Response);
		String id = js.getString("id");
		System.out.println("current id is "+id);
		
		
		//Add attachment
		RestAssured.given().pathParam("Issue", "10004").log().all().header("Content-Type","multipart/form-data").header("X-Atlassian-Token","no-check")
		.multiPart(new File("file"))
		.filter(SF)
		.when().post("/rest/api/2/issue/{Issue}/attachments").then().log().all().assertThat().statusCode(200).extract().response().asString();

		//Get comment and validate if it is the same one attached above.
		
		String IssueResponse = RestAssured.given().filter(SF).log().all().pathParam("Issue", "10004").queryParam("fields", "comment")
		.when().get("/rest/api/2/issue/{Issue}").then().log().all().extract().response().asString();
		System.out.println("****************************"+IssueResponse);
		
		JsonPath Res=stringToJson.strToJson(IssueResponse);
		
		int size = Res.getInt("fields.comment.comments.size()");
		
		for (int i=0;i<size;i++)
		{
			String Cid=Res.getString("fields.comment.comments["+i+"].id");
			System.out.println(Cid);
			if(Cid.equals(id))
			{
				String Comment=Res.getString("fields.comment.comments["+i+"].body");
				System.out.println("Comment is "+Comment);
				Assert.assertEquals("comment",Comment);
			}
			else
				System.out.println("String"+Cid+"did not match with "+id);
			
			
		}
		
	}

}
