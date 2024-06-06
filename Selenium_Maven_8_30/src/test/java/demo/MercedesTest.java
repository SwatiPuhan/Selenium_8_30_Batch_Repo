package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MercedesTest 
{
	@Test
	public void test()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercedes-benz.com/en/");
		Reporter.log("MercedesTest class executed",true);
		Reporter.log("MercedesTest class modified",true);
		Reporter.log("MercedesTest class modified again",true);
		

	}



}
