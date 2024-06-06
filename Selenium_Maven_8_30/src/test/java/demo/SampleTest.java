package demo;

import org.testng.Reporter;

public class SampleTest
{
	public void test()
	{
		Reporter.log("SampleTest  class is Executed",true); //because it is  pre-fixed with test");
                 	Reporter.log("Sampletest class is modified",true); 
	Reporter.log("Sampletest class is modified again",true); 
		Reporter.log("Sampletest class is modified again and again",true); 
	Reporter.log("Sampletest class is modified again swati",true);//because it is not pre-fixed with test");
	}
		
	
}




