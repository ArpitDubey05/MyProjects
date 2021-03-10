package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test3 {
	
	@Test
	public void personalloan1()
	{
		System.out.println("personalloan1");
	}
	
	@Test
	public void personalloan2()
	{
		System.out.println("personalloan2");
	}
	
	@Test
	public void personalloan3()
	{
		System.out.println("personalloan3");
	}
	@BeforeClass
	public void personalloan4()
	{
		System.out.println("Before class personal loan");
	}

}
