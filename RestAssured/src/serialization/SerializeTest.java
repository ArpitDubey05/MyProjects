package serialization;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SerializeTest {

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
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String res=RestAssured.given().log().all().queryParam("keys", "qaclick123").contentType("application/json").body(s)
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("This is response " + res);
	}

}
