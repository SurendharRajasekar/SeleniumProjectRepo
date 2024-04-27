package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pageobjects.HomePage;
import pageobjects.LandingPage;
import resources.Base;

public class LoginTest extends Base {

	Logger log;
	public WebDriver driver;
	
	
	
	@BeforeMethod
	public void openingbrowser() throws IOException
	{

		log = LogManager.getLogger(LoginTest.class.getName());	
		driver = initialiseDriver();
		driver.get(prop.getProperty("url"));
		log.debug("browser got launched");
	}

	@Test(dataProvider = "dataprovider")
	public void login(String mail, String pass, String result) throws IOException, InterruptedException {
 
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.loginbutton().click();
		log.debug("login button got clicked");
		landingpage.username().sendKeys(mail);
		log.debug("mail id is entered");
		Thread.sleep(1000);
		landingpage.password().sendKeys(pass);
		log.debug("password got entered");
		Thread.sleep(2000);
		landingpage.loginbutt().click();
		log.debug("login button is clicked");
		
		System.out.println("changes made for git");
        
		HomePage homepage = new HomePage(driver);
		Thread.sleep(3000);
		String actualresult=null	;
		try {
			if (homepage.check().isDisplayed()) {

				actualresult = "success";
				System.out.println("correct credentials");
			}
		} catch (Exception E) {
			actualresult = "failure";
			System.out.println("incorrect credentials");
		}
		Assert.assertEquals(actualresult,result);

	}

	@AfterMethod
	public void closure() {
		driver.quit();
	}

	@DataProvider
	public Object[][] dataprovider() {
		Object[][] data = { { "suru@mail.com", "suren", "failure" }, { "surendhar@mail.com", "surendhar", "success" },
				{ "suruss@mail.com", "strike", "failure" } };
		return data;
	}
}
