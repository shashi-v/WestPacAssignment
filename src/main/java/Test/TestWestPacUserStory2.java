package Test;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import PageFactory.CalculatorsHomePage;
import PageFactory.WestPacHomePage;

/**
 * Created by Shashi on 29/10/2020. Test for WestPac User Story 2
 */
public class TestWestPacUserStory2 {

	WebDriver driver;
	String westPacURL = " http://www.westpac.co.nz";
	WestPacHomePage objHomePage;
	CalculatorsHomePage objCalculatorHomePage;

	@BeforeMethod

	public void setup() {


		System.setProperty("webdriver.gecko.driver",
				"C:\\WestPac-master\\WestPac-master\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(westPacURL);
		objHomePage = new WestPacHomePage(driver);

	}

	@Test(priority = 1, description = "Defensive salaried calculation")

	public void test_case_1()
			throws InterruptedException {
		objHomePage.navigateToKiwisaverCalculatorPage();
		objCalculatorHomePage = new CalculatorsHomePage(driver);
		objCalculatorHomePage.test_case_1();
	}
	@Test(priority = 1, description = "Conservative Self-employed calculation")

	public void test_case_2()
			throws InterruptedException {
				objHomePage.navigateToKiwisaverCalculatorPage();
		objCalculatorHomePage = new CalculatorsHomePage(driver);
		objCalculatorHomePage.test_case_2();
	}
@Test(priority = 1, description = "Balanced Not employed calculation")

public void test_case_3()
		throws InterruptedException {
	objHomePage.navigateToKiwisaverCalculatorPage();
	objCalculatorHomePage = new CalculatorsHomePage(driver);
	objCalculatorHomePage.test_case_3();
}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}