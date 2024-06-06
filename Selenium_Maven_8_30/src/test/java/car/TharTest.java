package car;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TharTest 
{
	@Test
	public void test()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Reporter.log("TharTest class executed",true);

	}


}




