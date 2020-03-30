package com.sel.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sel.qa.base.TestBase;

public class CheckBoxDemo extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//div[contains(text(),'Single Checkbox Demo')]")
	WebElement singleCBDiv;
	
	@FindBy(xpath="//input[@id='isAgeSelected']")
	WebElement singleCheckbox;
	
	@FindBy(xpath="//div[@id='txtAge']")
	WebElement singleCBMsg;
	
	@FindBy(xpath="//div[contains(text(),'Multiple Checkbox Demo')]")
	WebElement multipleCBDiv;
	
	@FindBy(xpath="//div[contains(text(),'Multiple Checkbox Demo')]//following::div[@class='checkbox'][1]//input[@class='cb1-element']")
	WebElement cbOption1;
	
	@FindBy(xpath="//div[contains(text(),'Multiple Checkbox Demo')]//following::div[@class='checkbox'][2]//input[@class='cb1-element']")
	WebElement cbOption2;
	
	@FindBy(xpath="//div[contains(text(),'Multiple Checkbox Demo')]//following::div[@class='checkbox'][4]//input[@class='cb1-element']")
	WebElement cbOption3;
	
	@FindBy(xpath="//div[contains(text(),'Multiple Checkbox Demo')]//following::div[@class='checkbox'][4]//input[@class='cb1-element']")
	WebElement cbOption4;
	
	@FindBy(xpath="//input[@value='Check All']")
	WebElement checkAllBtn;
	
	@FindBy(xpath="//input[@value='Uncheck All']")
	WebElement uncheckAllBtn;
	
	// Initializing the Page Objects:
	public CheckBoxDemo() {
		PageFactory.initElements(driver, this);
	}
	
//Actions:

	public String CheckboxDemoPageTitle() {
		return driver.getTitle();
	}
	
	public void SingleCBDemo()
	{
		Boolean flag = singleCBDiv.isDisplayed();
		if (flag=true)
		{
		singleCheckbox.click();
		}
		String checkMsg = singleCBMsg.getText();
		System.out.println("Check box select message text is : "+ checkMsg);
	}
	
	public void MultipleCBDemo()
	{
		Boolean flag1 = multipleCBDiv.isDisplayed();
		if (flag1=true)
		{
			cbOption1.click();
			System.out.println("Check All Button display : "+checkAllBtn.isDisplayed());
			System.out.println("Check All Button display : "+checkAllBtn.isDisplayed());
			checkAllBtn.click();
			System.out.println("Check All Button clicked successfully");
		}
		
		System.out.println("UnCheck All Button display : "+uncheckAllBtn.isDisplayed());
		uncheckAllBtn.click();
		System.out.println("UnCheck All Button clicked successfully");
	}


}
