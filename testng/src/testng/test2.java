package testng;

import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {

	@Test
	public void carloan1()
	{
		System.out.println("carloan1");
	}
	
	@Test(enabled=false)
	public void carloan2()
	{
		System.out.println("carloan2 this should not come");
	}
	
	@Test(groups= {"Regression"})
	public void carloan3()
	{
		System.out.println("carloan3(groups= {\"Regression\"})");
	}
	@AfterMethod
	public void homeloanBefore()
	{
		System.out.println("after every method in class 2");
	}
}

