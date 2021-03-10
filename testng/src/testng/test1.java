package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void homeloan1()
	{
		System.out.println("hommeloan1");
	}
	
	@Parameters({"url"})
	@Test
	public void homeloan2(String urlpassed)
	{
		System.out.println("hommeloan2 " +urlpassed);
	}
	
	@Test
	public void homeloan3()
	{
		System.out.println("hommeloan3");
	}
	@BeforeMethod
	public void homeloanBefore()
	{
		System.out.println("before every method in class 1");
	}
}
