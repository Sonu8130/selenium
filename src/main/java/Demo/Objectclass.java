package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Objectclass {

	WebDriver driver;
	
	public Objectclass(WebDriver driver2) {
		this.driver=driver2;
	}


	@FindBy(className = "btn btn-quaternary")
	WebElement Loginbutton;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement Email;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement submit;

	public WebElement Loginbutton() {
		return Loginbutton;
	}
	
	public WebElement Email() {
		return Email;
	}

	public WebElement password() {
		return password;
	}

	public WebElement submit() {
		return submit;
	}

}
