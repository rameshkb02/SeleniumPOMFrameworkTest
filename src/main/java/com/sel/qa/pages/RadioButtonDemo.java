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
	WebElement femleRB;
	
	@FindBy(xpath="//input[@value='15 - 50' and @name='ageGroup']")
	WebElement ageGrp15To50;
	
	@FindBy(xpath="//button[contains(text(),'Get values')]")
	WebElement getValuesBtn;
	
	@FindBy(xpath="//p[@class='groupradiobutton']")
	WebElement displayedValues;

	// Initializing the Page Objects:
	public RadioButtonDemo() {
		PageFactory.initElements(driver, this);
	}
	
//Actions:

	public String radioButtonPageTitle() {
		return driver.getTitle();
	}
	
	public void singleRB() throws InterruptedException
	{
		Boolean flag = radioBtnDiv.isDisplayed();
		if (flag==true)
		{
			maleRBOption.click();
			getCheckedBtn.click();
			Thread.sleep(2000);
			System.out.println("Get Value after click Button: " +rbMsgTxt.getText());
		}
}
	
	public void groupRB() throws InterruptedException	{
		Boolean flag1 = grbDemo.isDisplayed();
		if (flag1==true)
		{
			femleRB.click();
			ageGrp15To50.click();
			Thread.sleep(2000);
			System.out.println("Get Value after click Button: " +displayedValues.getAttribute(""));
		}
	}

}
