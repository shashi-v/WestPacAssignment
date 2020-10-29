package Test;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import PageFactory.CalculatorsHomePage;
import PageFactory.WestPacHomePage;

/**
 * Created by Shashi on 29/10/2020. Test for WestPac User Story 1
 * indication as to what has to be rectified.
 */
public class TestWestPacUserStory1 {

	WebDriver driver;
	String westPacURL = " http://www.westpac.co.nz";
	WestPacHomePage objHomePage;

	CalculatorsHomePage objCalculatorHomePage;

	@BeforeTest

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

	@Test(priority = 1)

	public void test_User_Story_1() {
		objHomePage.navigateToKiwisaverCalculatorPage();
		objCalculatorHomePage = new CalculatorsHomePage(driver);
		objCalculatorHomePage.verifyInfoIconInCalculatorPage();
	}


	@AfterTest
	public void tearDown() {
		driver.close();
	}
}