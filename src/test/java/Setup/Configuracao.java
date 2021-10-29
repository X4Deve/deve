package Setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Configuracao {

	private static WebDriver driver;

	@Before
	public void beforeCenario() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@After
	public void afterCenario() {
		driver.close();
	}
}
