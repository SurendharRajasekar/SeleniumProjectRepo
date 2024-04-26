package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.LandingPage;
import resources.Base;

public class Login extends Base{
	WebDriver driver;
	LandingPage landingpage;
	HomePage homepage;
	
	@Given("^open browser$")
	public void open_browser() throws IOException
	{
		driver = initialiseDriver();
		
		
	}

	@And("^navigate to login page$")
	public void navigate_to_login_page()
	{
		driver.get(prop.getProperty("url"));
		
	}
	
	
	@When("^user enter username as \"([^\"]*)\" and password as \"([^\"]*)\" in the required field$")
	public void user_enter_username_and_password(String mail,String pass) throws InterruptedException
	{
		landingpage = new LandingPage(driver);
		landingpage.loginbutton().click();  
		landingpage.username().sendKeys(mail);
		Thread.sleep(1000);
		landingpage.password().sendKeys(pass);
		Thread.sleep(2000);
	}
	
	@And("^user clicks on login button$")
	public void user_clicks_login_button() throws InterruptedException
	{
		landingpage.loginbutt().click();
	}
	
	@Then("^verify if user is able to login when expected condition is met$")
	public void verify_is_user_is_able_to_login_when_condition_is_met() throws InterruptedException
	{
		Thread.sleep(2000);
		homepage = new HomePage(driver);
		Assert.assertTrue(homepage.check().isDisplayed());
	}
	
	@After
	public void closebrowser()
	{
		driver.close();
	}
}
