package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nameofuser")
	private WebElement checkuser;

	public WebElement check() {

		return checkuser;
	}

	@FindBy(linkText = "Samsung galaxy s7")
	private WebElement samsungs7;

	public WebElement buys7() {
		return samsungs7;
	}

}
