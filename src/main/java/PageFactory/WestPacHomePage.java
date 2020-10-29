package PageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class WestPacHomePage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"ubermenu-section-link-kiwisaver-ps\"]")

	WebElement kiwisaverLink;

//	@FindBy(id = "ubermenu-item-1-4-ps")

	@FindBy(xpath = "//*[@id=\"ubermenu-item-cta-kiwisaver-calculators-ps\"]")

	WebElement calculatorsButton;

	@FindBy(xpath = "//*[@id=\"content-ps\"]/div[2]/div/section/p[4]/a")

	WebElement getStartedButton;



	public WestPacHomePage(WebDriver driver) {

		this.driver = driver;
		driver.manage().window().maximize();

		// Create all WebElements

		PageFactory.initElements(driver, this);

	}

	// Navigate to Kiwisaver Calculator Page from Home Page

	public void navigateToKiwisaverCalculatorPage() {
		//kiwisaverLink.click();
		//getStartedButton.click();
		//Actions xAct = new Actions(driver);
		//xAct.moveToElement(calculatorsButton);
		//xAct.click();
		//xAct.perform();

		//categories = driver.findElement(By.xpath("//a[@class='cat_btn hidden-xs giTrackElementHeader']"));
		//subMenu = driver.findElement(By.xpath("//li[@class='course_category_name_menu']//a[@id='software-testing-certification-courses']"));

		Actions action = new Actions(driver);
		action.moveToElement(kiwisaverLink).perform();
		action.moveToElement(calculatorsButton).click().perform();
		//action.moveToElement(calculatorsButton).click();
		//calculatorsButton.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getStartedButton.click();

	}

}