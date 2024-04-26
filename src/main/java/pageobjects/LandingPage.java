package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login2")

	private WebElement loginbutton; // Encapsulation

	public WebElement loginbutton() {
		return loginbutton;
	}

	@FindBy(id = "loginusername")
	private WebElement username;

	public WebElement username() {
		return username;
	}

	@FindBy(id = "loginpassword")
	private WebElement password;

	public WebElement password() {
		return password;
	}

	@FindBy(xpath = "//button[contains(@class,'btn-primary') and text()='Log in']")
	private WebElement button;

	public WebElement loginbutt() {
		return button;
	}
}
