package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginpage {
	WebDriver driver;
	
	
	@Test
	public void Login() {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Objectclass ob = new Objectclass(driver);
		
		ob.Loginbutton.click();
		ob.Email.sendKeys("Hello");
		ob.password.sendKeys("password");
		ob.submit.click();

		
	}

}
