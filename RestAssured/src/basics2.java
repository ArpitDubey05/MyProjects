import io.restassured.RestAssured;
//import io.restassured.matcher.ResponseAwareMatcher;
//import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

//import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
//import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import Files.Payload;
import Files.stringToJson;

public class basics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String Response=RestAssured.given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println("printed" + Response);
		
		JsonPath js = new JsonPath(Response);
		String place_id = js.getString("place_id");
		System.out.println(place_id);
		  
		//Update address
		
		String newAddress = "kahin bhi chale jao yr";
		RestAssured.given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+place_id+"\",\r\n" + 
				"\"address\":\""+newAddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}")
		.when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		
		// Get place
		
		String Place= RestAssured.given().log().all().queryParam("key","qaclick123").queryParam("place_id",place_id)
				.when().get("maps/api/place/get/json")
				.then().assertThat().log().all().statusCode(200).extract().response().asString();
		System.out.println("Place value is" + Place);
		
		JsonPath JS1=stringToJson.strToJson(Place);
		String Actualaddress = JS1.getString("address");
		
		System.out.println(Actualaddress);
		Assert.assertEquals(Actualaddress, "kahin bhi chale jao yr");
		
	}

	
}
