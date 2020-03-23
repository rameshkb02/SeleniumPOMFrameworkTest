package com.sel.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sel.qa.base.TestBase;

public class SimpleFormDemo extends TestBase{
	
	//Page Factory - OR:
			@FindBy(xpath="//div[contains(text(),'Single Input Field')]")
			WebElement singleInputDiv;
			
			@FindBy(xpath="//input[@id='user-message']")
			WebElement enterMessage;
			
			@FindBy(xpath="//button[contains(text(),'Show Message')]")
			WebElement showMessageBtn;
			
			@FindBy(xpath="//span[@id='display']")
			WebElement yourMessageTxt;
			
			@FindBy(xpath="//div[contains(text(),'Two Input Fields')]")
			WebElement twoInputDiv;
			
			@FindBy(xpath="//input[@id='sum1']")
			WebElement enterValA;
			
			@FindBy(xpath="//input[@id='sum2']")
			WebElement enterValB;
			
			@FindBy(xpath="//button[contains(text(),'Get Total')]")
			WebElement getTotalBtn;
			
			@FindBy(xpath="//span[@id='displayvalue']")
			WebElement yourTotalValue;
		
			// Initializing the Page Objects:
			public SimpleFormDemo() {
				PageFactory.initElements(driver, this);
			}
			
		//Actions:
		
			public String simpleFormPageTitle() {
				return driver.getTitle();
			}
			
			public void singleInput(String message)
			{
				enterMessage.sendKeys(message);
				showMessageBtn.click();
				String yourMsg = yourMessageTxt.getText();
				System.out.println("Your message text is : "+ yourMsg);
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
