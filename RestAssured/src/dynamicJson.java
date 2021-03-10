import org.testng.annotations.*;
import org.testng.annotations.Test;

import Files.Payload;
import Files.stringToJson;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class dynamicJson {

	
	/*@Test(dataProvider="BigData")
	public void addBook(String isbn,String isle)
	
	{
		RestAssured.baseURI="http://216.10.245.166";
		
		//given().log().all().header("Content-Type","application/json")
		//.when().de;
		
		
	String Response=given().log().all().header("Content-Type","application/json")
		.when().body(Payload.addBook(isbn,isle)).post("/Library/Addbook.php")
		.then().assertThat().statusCode(200).body("Msg", equalTo("successfully added")).extract().response().asString();
		System.out.println(Response);
		
		JsonPath js= stringToJson.strToJson(Response);
		int Id=js.get("ID");
		System.out.println(Id);
	}
	
	@Test(dataProvider="BigData")
public void dltBook(String isbn,String isle)
	
	{
		RestAssured.baseURI="http://216.10.245.166";
		
		System.out.println("input is"+Payload.deleteBook(isbn,isle));
	String Response=given().log().all().header("Content-Type","application/json")
		.when().body(Payload.deleteBook(isbn,isle)).post("/Library/DeleteBook.php")
		.then().assertThat().statusCode(200).body("msg", equalTo("book is successfully deleted")).extract().response().asString();
		System.out.println(Response);
		
		JsonPath js= stringToJson.strToJson(Response);
		String msg=js.get("msg");
		System.out.println(msg);
	}*/
	
	@Test
	
	public void ReadFile() throws IOException
	
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String Response=RestAssured.given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\arpitdu\\Desktop\\new 11.txt"))))
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println("Response is " + Response);
		
		JsonPath js = new JsonPath(Response);
		String place_id = js.getString("place_id");
		System.out.println(place_id);
		
	}
	
	@DataProvider(name="BigData")
	
	public Object[][] data()
	{
	return new Object[][] {{"qweqwe","2343"},{"ccxv","55454"},{"hjghj","6666"}};
	}
}
 //.body(Payload.addBook())