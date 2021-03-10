package stepDefinition;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Location;
import pojo.Searializable;
import resourses.TestDataBuild;

public class StepDefinition {
	ResponseSpecification res;
	RequestSpecification req;
	RequestSpecification r;
	Response response;
	
	@Given("Add Place Payload")
	public void add_place_payload() {
		 System.out.println("Under given condition");
		
			TestDataBuild TD=new TestDataBuild();
			 req= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).addQueryParam("keys", "qaclick123").build();
			res=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
			
			 r =RestAssured.given().spec(req).body(TD.addPlacePayload());
			
	}


	//Some other steps were also undefined:

	@When("user post HTTP {string} request")
	public void user_post_http_request(String string) {
	   System.out.println("Under when condition");
	    response = r.when().post("/maps/api/place/add/json").then().spec(res).extract().response();
	}
	@Then("call success with {int}")
	public void call_success_with(Integer int1) {
	   System.out.println("Under then condition");
	   assertEquals(response.getStatusCode(),200);
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
	    System.out.println("under then condition");
	}


}
