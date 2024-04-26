package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class SecondTest extends Base {
	public WebDriver driver;
	 @Test
	  public void sample() throws IOException, InterruptedException
	  {
			driver= initialiseDriver();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			Assert.assertTrue(false);
			Thread.sleep(1000);
			driver.quit();
		    
	  }


}
