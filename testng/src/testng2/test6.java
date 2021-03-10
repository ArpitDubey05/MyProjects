package testng2;

import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;

public class test6 {
	
	@BeforeSuite
	public void notest()
	{
		System.out.println("notest-beforesuite");
	}

}
