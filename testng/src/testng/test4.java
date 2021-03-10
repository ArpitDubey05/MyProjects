package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class test4 {
	
	@Test
	public void propertyloan1()
	{
		System.out.println("propertyloan1");
	}
	
	@AfterSuite
	public void propertyloan2()
	{
		System.out.println("propertyloan2-aftersuite");
	}
	
	@Test(groups= {"Regression"})
	public void propertyloan3()
	{
		System.out.println("propertyloan3 (groups= {\"Regression\"})");
	}
	@AfterClass
	public void propertyloan4()
	{
		System.out.println("Afterclass4");
	}

}
