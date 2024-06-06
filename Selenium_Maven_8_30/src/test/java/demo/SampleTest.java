//package demo;
//
//import org.testng.Reporter;
//
//public class SampleTest
//{
//	public void test()
//	{
//		Reporter.log("SampleTest  class is Executed",true); //because it is  pre-fixed with test");
                 	Reporter.log("Sampletest class is modified",true); 
	Reporter.log("Sampletest class is modified again",true); 
//	}
//		
//	
//}
//


package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
    
    @Test
    public void test() {
        //System.out.println("SampleTest class is Executed");
    	Reporter.log("Sampletest class is Executed",true); 
	    	Reporter.log("Sampletest class is modified",true); //because it is not pre-fixed with test");
	
    }
}
