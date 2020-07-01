package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentDemo {

	ExtentReports report;

	@Test
	public void config() {

		String path = System.getProperty("user.dir") + "\\reports\\index.html";
//		ExtentSparkReporter
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Laern selenium");
		reporter.config().setReportName("Sanity Test");

//		ExtentReports
		report = new ExtentReports();
		report.attachReporter(reporter);

	}

	@Test
	public void test() {

		report.createTest("sonuxtentreoprt");

		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.close();
		report.flush();
	}
	
}
