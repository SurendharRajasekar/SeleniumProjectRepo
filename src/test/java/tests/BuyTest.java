package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class BuyTest extends Base{
	
  public WebDriver driver;
  
 @Test
  public void openbrowser() throws IOException, InterruptedException
  {
		driver= initialiseDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(1000);
		driver.quit();;
  }

}
