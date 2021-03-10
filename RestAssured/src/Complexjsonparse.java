//import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import Files.Payload;
import io.restassured.path.json.JsonPath;

public class Complexjsonparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(Payload.Courseprice()); 
		
		//number of courses present in the json
		
		int coursesize= js.getInt("courses.size()");
		System.out.println(coursesize);
		
		//Print purchase amount
		
		int purchaseamount= js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseamount);
		
		//Print Title of the first course
		
		String Titlefirst= js.get("courses[0].title");
		System.out.println(Titlefirst);
		
		//Print all courses ans their respective prices
		
		for (int i=0;i<coursesize;i++)
		{
			
			String Title= js.get("courses["+i+"].title");
			int Price= js.get("courses["+i+"].price");
			System.out.println(i+1 +" Course is "+Title);
			System.out.println("Price for "+Title+" is "+Price);
			
			
		}
		
		//Print number of courses sold for RPA
		
		for (int i=0;i<coursesize;i++)
		{
			
			String Title= js.get("courses["+i+"].title");
			String Constant="RPA";
			System.out.println(Title);

			if (Title.equals(Constant))
			
			{
				int Sold=js.get("courses["+i+"].copies");
				System.out.println("Number of courses sold for RPA is "+Sold);
				break;
			}
					
			
		}
		
		//Verify if sum of all courses matches total ammount
		int total=0;
		int amount=js.get("dashboard.purchaseAmount");
		for (int i=0;i<coursesize;i++)
		{
			int Price=js.get("courses["+i+"].price");
			int copies=js.get("courses["+i+"].copies");
			
			total=total+Price*copies;
		}
		
		System.out.println(total);
		Assert.assertEquals(total,910);
		Assert.assertEquals(total,amount);
	}

}
