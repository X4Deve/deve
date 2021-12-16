package Setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestRule {
	private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;

	@Before
	public void beforeCenario(Scenario cenario) {
		if (extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);
		}

		extentTest = extentReport.createTest(cenario.getId());

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://lojaebac.ebaconline.art.br/minha-conta/");

	}

	@After
	public void afterCenario(Scenario cenario) {
		if (cenario.isFailed()) {
			extentTest.log(Status.FAIL, "Cen�rio " + cenario.getName() + " executado com falhas!");
			extentReport.flush();
		} else {
			extentTest.log(Status.PASS, "Cen�rio " + cenario.getName() + " executado com sucesso!");
			extentReport.flush();
		}

		if (driver != null) {
			driver.close();
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static ExtentTest getExtentTest() {
		return extentTest;
	}
}
