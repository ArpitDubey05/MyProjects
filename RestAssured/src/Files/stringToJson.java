package Files;

import io.restassured.path.json.JsonPath;

public class stringToJson {

	public static JsonPath strToJson (String Response)
	{
		JsonPath js = new JsonPath(Response);
		//String Actualaddress = js.getString("address");
		return js;
	}

}