package com.sel.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sel.qa.base.TestBase;

public class DemoHome extends TestBase {
	// Page Factory - OR:

	@FindBy(xpath = "//a[contains(text(),'Demo Home')]")
	WebElement demoHomeLink;
	@FindBy(xpath = "//a[contains(text(),'Selenium Easy')]")
	WebElement seleniumEasyLink;
	@FindBy(xpath = "//a[contains(text(),'Input Forms') and @class='dropdown-toggle']")
	WebElement inputFormsDD;
	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]")
	WebElement simpleFormDemo;
	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Checkbox Demo')]")
	WebElement checkBoxDemo;
	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Radio Buttons Demo')]")
	WebElement radioButtonDemo;
	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Select Dropdown List')]")
	WebElement selDropdownList;
	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Input Form Submit')]")
	WebElement inputFormSubmit;

	// Initializing the Page Objects:
	public DemoHome() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateDemoHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateSelEasyImage() {
		return seleniumEasyLink.isDisplayed();
	}

	public boolean validateInputFormsOption() {
		return inputFormsDD.isDisplayed();
	}

	public SimpleFormDemo navigateSimpleForm() {
		inputFormsDD.click();
		simpleFormDemo.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new SimpleFormDemo();
	}

	public CheckBoxDemo navigateCheckBoxDemo() {
		inputFormsDD.click();
		checkBoxDemo.click();
		return new CheckBoxDemo();
	}

	public RadioButtonDemo navigateRadioButtonDemo() {
		inputFormsDD.click();
		radioButtonDemo.click();
		return new RadioButtonDemo();
	}

}
