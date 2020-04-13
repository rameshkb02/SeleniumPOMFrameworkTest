package com.sel.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sel.qa.base.TestBase;
import com.sel.qa.pages.CheckBoxDemo;
import com.sel.qa.pages.DemoHome;
import com.sel.qa.pages.SimpleFormDemo;

public class CheckBoxPageTest extends TestBase{
	
	SimpleFormDemo simpleForm;
	DemoHome demoHome;
	CheckBoxDemo checkBox;
	
	public CheckBoxPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		demoHome= new DemoHome();
		checkBox = new CheckBoxDemo();
		demoHome.navigateCheckBoxDemo();
	}

	@Test(priority = 1)
	public void checkBoxHomePageTitleTest() {
		String title = checkBox.CheckboxDemoPageTitle();
		Assert.assertEquals(title, "Selenium Easy - Checkbox demo for automation using selenium","Title Mismatch");
	}
	
	@Test(priority=2)
	public void checkSingleCBTest() {
		checkBox.SingleCBDemo();	
	}
	
	@Test(priority=3)
	public void checkMultipleCBTest() {
		checkBox.MultipleCBDemo();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
