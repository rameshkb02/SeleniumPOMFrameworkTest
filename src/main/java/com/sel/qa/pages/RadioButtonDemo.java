package com.sel.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sel.qa.base.TestBase;

public class RadioButtonDemo extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//div[contains(text(),'Radio Button Demo')]")
	WebElement radioBtnDiv;
	
	@FindBy(xpath="//input[@value='Male' and @name='optradio']")
	WebElement maleRBOption;
	
	@FindBy(xpath="//button[@id='buttoncheck']")
	WebElement getCheckedBtn;
	
	@FindBy(xpath="//p[@class='radiobutton']")
	WebElement rbMsgTxt;
	
	@FindBy(xpath="//div[contains(text(),'Group Radio Buttons Demo')]")
	WebElement grbDemo;
	
	@FindBy(xpath="//input[@value='Female' and @name='gender']")
	WebElement enterValA;
	
	@FindBy(xpath="//input[@id='sum2']")
	WebElement enterValB;
	
	@FindBy(xpath="//button[contains(text(),'Get Total')]")
	WebElement getTotalBtn;
	
	@FindBy(xpath="//span[@id='displayvalue']")
	WebElement yourTotalValue;

	// Initializing the Page Objects:
	public RadioButtonDemo() {
		PageFactory.initElements(driver, this);
	}
	
//Actions:

	public String simpleFormPageTitle() {
		return driver.getTitle();
	}
	
	public void singleInput(String message)
	{
		//enterMessage.sendKeys(message);
		//showMessageBtn.click();
		//String yourMsg = yourMessageTxt.getText();
		//System.out.println("Your message text is : "+ yourMsg);
	}
	
	public void twoInputAdd(String val1, String val2)
	{
		enterValA.sendKeys(val1);
		enterValB.sendKeys(val2);
		getTotalBtn.click();
		String totalValue = yourTotalValue.getText();
		System.out.println("Your total value is : "+ totalValue);
	}

}
