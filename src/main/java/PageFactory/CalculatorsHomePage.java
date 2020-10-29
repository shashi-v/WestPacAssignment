package PageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class CalculatorsHomePage {

	WebDriver driver;



	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div/div[2]/div/iframe")

	WebElement iFrame;


	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button")

	WebElement currentAgeInfoIcon;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div")

	WebElement currentAgeMsgText;


	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/button")

	WebElement employmentStatusInfoIcon;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div")

	WebElement employmentStatusMsgText;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/div/div/div/button")

	WebElement currentBalanceInfoIcon;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[2]/div")

	WebElement currentBalanceMsgText;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[2]/div/div/div/button")

	WebElement voluntaryContInfoIcon;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[2]/div")

	WebElement voluntaryContMsgText;


	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/button")

	WebElement savingGoalInfoIcon;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[2]/div")

	WebElement savingGoalMsgText;


	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[2]/div/div/div/button")

	WebElement riskProfileInfoIcon;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[2]/div/p[1]")

	WebElement riskProfileMsgTextHeading;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]")

	WebElement riskProfileMsgTextLowRisk;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[2]/div/ul/li[2]")

	WebElement riskProfileMsgTextMediumRisk;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[2]/div/ul/li[3]")

	WebElement riskProfileMsgTextLHighRisk;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[2]/div/p[2]")

	WebElement riskProfileMsgTextFooter;


	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input")

	WebElement currentAgeEditBox;

//	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div")
//
//	WebElement employmentStatusDropdown;

	@FindBy(css = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well")
	WebElement employmentStatusDropdown;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]/div")

	WebElement frequencyDropdown;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")

	WebElement salaryWagesEditBox;

	@FindBy(xpath = "//*[@id=\"radio-option-04F\"]")

	WebElement contribution4RadioBtn;

	@FindBy(xpath = "//*[@id=\"radio-option-013\"]")

	WebElement defensiveRiskRadioBtn;


	@FindBy(xpath = "//*[@id=\"radio-option-016\"]")

	WebElement conservativeRiskRadioBtn;

	@FindBy(xpath = "//*[@id=\"radio-option-019\"]")

	WebElement balancedRiskRadioBtn;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[2]")

	WebElement calculateBtn;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[1]/span[1]")

	WebElement resultText;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[1]/span[2]")

	WebElement resultAmount;

//	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[2]/div")
//
//	WebElement employedOption;


	@FindBy(css = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well +div li:nth-child(2) span")

	WebElement employedOption;

	String employmentStatusItems_EmployedCss = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well +div li:nth-child(2) span";
	String employmentStatusItems_Self_EmployedCss = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well +div li:nth-child(3) span";
	String employmentStatusItems_Not_EmployedCss = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well +div li:nth-child(4) span";


//	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[3]/div")
//
//	WebElement selfEmployedOption;

	@FindBy(css = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well +div li:nth-child(3) span")

	WebElement selfEmployedOption;



//	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[4]/div")
//
//	WebElement notEmployedOption;


	@FindBy(css = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well +div li:nth-child(4) span")

	WebElement notEmployedOption;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[3]/div")

	WebElement fortnightlyOption;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[5]/div")

	WebElement annuallyOption;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")

	WebElement currentKiwiBalanceEditBox;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input")

	WebElement voluntaryContribution;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")

	WebElement savingGoalEditBox;


//Completed
	public void test_case_1() throws InterruptedException {
		switchToIframe();
		currentAgeEditBox.sendKeys("30");
		Thread.sleep(2000);
		employmentStatusDropdown.click();
		Thread.sleep(2000);
		employedOption.click();
		salaryWagesEditBox.sendKeys("82000");
		contribution4RadioBtn.click();
		defensiveRiskRadioBtn.click();
		calculateBtn.click();
//		Assert.assertEquals(resultText.getText(),"At age 65, your KiwiSaver balance is estimated to be:");
	//	Assert.assertEquals(resultAmount.getText(),"$436,365");
		switchToParentFrame();
	}

//Completed

	public void test_case_2() throws InterruptedException {
		switchToIframe();
		currentAgeEditBox.sendKeys("45");
		Thread.sleep(2000);
		employmentStatusDropdown.click();
		Thread.sleep(2000);
		selfEmployedOption.click();
		currentKiwiBalanceEditBox.sendKeys("100000");
		voluntaryContribution.sendKeys("90");
		frequencyDropdown.click();
		Thread.sleep(2000);
		fortnightlyOption.click();
		conservativeRiskRadioBtn.click();
		savingGoalEditBox.sendKeys("290000");
		calculateBtn.click();
		Assert.assertEquals(resultText.getText(),"At age 65, your KiwiSaver balance is estimated to be:");
		//Assert.assertEquals(resultAmount.getText(),"$259,581");
		switchToParentFrame();

	}
//Completed
	public void test_case_3() throws InterruptedException {
		switchToIframe();

		currentAgeEditBox.sendKeys("55");
		Thread.sleep(2000);
		employmentStatusDropdown.click();
		Thread.sleep(2000);
		notEmployedOption.click();
		currentKiwiBalanceEditBox.sendKeys("14000");
		voluntaryContribution.sendKeys("10");
		frequencyDropdown.click();
		Thread.sleep(2000);
		annuallyOption.click();
		balancedRiskRadioBtn.click();
		savingGoalEditBox.sendKeys("200000");
		calculateBtn.click();
		Assert.assertEquals(resultText.getText(),"At age 65, your KiwiSaver balance is estimated to be:");
		//Assert.assertEquals(resultAmount.getText(),"$19,943");
		switchToParentFrame();

	}

	public CalculatorsHomePage(WebDriver driver) {
		this.driver = driver;

		// Create all WebElements
		PageFactory.initElements(driver, this);
	}

	// Navigate to Kiwisaver Calculator Page from Home Page
private String trim_msg_string(String textMsg){
	String text;
	text = textMsg.replaceAll("‘"," ");
	text = text.replaceAll("'"," ");
	text = text.replaceAll("'"," ");
	text = text.replaceAll("’"," ");
	return text;
}
	public void verifyInfoIconInCalculatorPage() {
		String msg;
		String txt_displayed;
//		Integer size = driver.findElements(By.tagName("iframe")).size();
//
//		System.out.println("size is  = " + size);
		switchToIframe();
// Verify the presence of Information Icon
		Assert.assertEquals(true, currentAgeInfoIcon.isDisplayed());
		Assert.assertEquals(true, employmentStatusInfoIcon.isDisplayed());
		Assert.assertEquals(true, currentBalanceInfoIcon.isDisplayed());
		Assert.assertEquals(true, voluntaryContInfoIcon.isDisplayed());
		Assert.assertEquals(true, riskProfileInfoIcon.isDisplayed());
		Assert.assertEquals(true, savingGoalInfoIcon.isDisplayed());

// Verify the Help Text displayed

		currentAgeInfoIcon.click();
		Assert.assertEquals(currentAgeMsgText.getText(),"This calculator has an age limit of 18 to 64 years old.");
		employmentStatusInfoIcon.click();
		msg = employmentStatusMsgText.getText();
		txt_displayed = trim_msg_string(msg);
		Assert.assertEquals(txt_displayed,"If you are earning a salary or wage, select  Employed . Your employer contributions will be automatically calculated at a rate of 3% of your before-tax salary or wages. You can also select  Self-employed  or  Not employed  and then enter below (in the Voluntary contributions field), the amount and frequency of any contributions that you wish to make.");

		currentBalanceInfoIcon.click();
		Assert.assertEquals(currentBalanceMsgText.getText(),"If you do not have a KiwiSaver account, then leave this field blank.");
		voluntaryContInfoIcon.click();

		msg = voluntaryContMsgText.getText();
		txt_displayed = trim_msg_string(msg);
		Assert.assertEquals(txt_displayed,"If you are  Self-Employed  or  Not employed , you can make direct contributions to your KiwiSaver account. If you are  Employed , you can make voluntary contributions in addition to your regular employee contributions.");
		riskProfileInfoIcon.click();
		Assert.assertEquals(riskProfileMsgTextHeading.getText(),"The risk profile affects your potential investment returns:");
		Assert.assertEquals(riskProfileMsgTextLowRisk.getText(),"Low risk investments usually contain mostly income assets. Generally, investments of this nature can be expected to deliver modest but more consistent returns. They are less likely to go up and down, but will usually provide lower returns over the long term.");
		Assert.assertEquals(riskProfileMsgTextMediumRisk.getText(),"Medium risk investments are spread more evenly between income assets and growth assets. Generally, these types of investments can be expected to provide moderate levels of returns with moderate levels of investment risk. Returns will vary and may be low or negative in some years.");
		Assert.assertEquals(riskProfileMsgTextLHighRisk.getText(),"High risk investments usually contain mostly growth assets. Investments with more exposure to growth assets have the potential for higher long-term returns, but they are more likely to go up and down in the short term and will experience periods of negative returns.");
		Assert.assertEquals(riskProfileMsgTextFooter.getText(),"You can also use our KiwiSaver Risk Profiler to help determine your tolerence to risk.");

		savingGoalInfoIcon.click();
		msg = savingGoalMsgText.getText();
		txt_displayed = trim_msg_string(msg);
		Assert.assertEquals(txt_displayed,"Enter the amount you would like to have saved when you reach your intended retirement age. If you aren t sure what this amount is, you can leave it blank or use the Sorted Retirement Planner");
		switchToParentFrame();

	}



	public void switchToIframe() {
		driver.switchTo().frame(iFrame);
	}

	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

}