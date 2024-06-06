package demo;

import org.testng.Reporter;

public class Sample
{
	public void test()
	{
		Reporter.log("Sample class not Executed",true); //because it is not pre-fixed with test");
	}
		
	}