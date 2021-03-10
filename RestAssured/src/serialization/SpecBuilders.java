package serialization;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Searializable s=new Searializable();
		s.setAccuracy(50);
		s.setAddress("29, side layout, cohen 09");
		s.setLanguage("French-IN");
		s.setName("Frontline house");
		s.setPhone_number("(+91) 983 893 3937");
		s.setWebsite("http://google.com");
		Location l=new Location();
		
		l.setLat(-38.383494);
		l.setLng(33.427362);
		s.setLocation(l);
		
		List<String> list=new ArrayList<String>();
		list.add("shoe park");
		list.add("shop");
		s.setTypes(list);
		
		RequestSpecification req= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).addQueryParam("keys", "qaclick123").build();
		ResponseSpecification res=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		String Response=RestAssured.given().spec(req).body(s).post("/maps/api/place/add/json")
		.then().spec(res).extract().response().asString();
		
//		RestAssured.baseURI="https://rahulshettyacademy.com";
//		String res=RestAssured.given().log().all().queryParam("keys", "qaclick123").contentType("application/json").body(s)
//		.when().post("/maps/api/place/add/json")
//		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("This is response " + Response);
	}

}
