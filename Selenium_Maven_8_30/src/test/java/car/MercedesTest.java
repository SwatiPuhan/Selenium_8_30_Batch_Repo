package car;

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
		driver.get("https://mercedes.com/en.html");
		Reporter.log("mercedesTest class executed",true);

	}


}




