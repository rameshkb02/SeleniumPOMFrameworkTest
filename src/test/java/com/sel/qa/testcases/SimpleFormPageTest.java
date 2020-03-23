package com.sel.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sel.qa.base.TestBase;
import com.sel.qa.pages.DemoHome;
import com.sel.qa.pages.SimpleFormDemo;

public class SimpleFormPageTest extends TestBase{
	
	SimpleFormDemo simpleForm;
	DemoHome demoHome;
	
	public SimpleFormPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		demoHome= new DemoHome();
		simpleForm = new SimpleFormDemo();
		demoHome.navigateSimpleForm();
	}
	
	@Test(priority = 1)
	public void demoHomePageTitleTest() {
		String title = simpleForm.simpleFormPageTitle();
		Assert.assertEquals(title, "Selenium Easy Demo - Simple Form to Automate using Selenium","Title Mismatch");
	}
	
	@Test(priority=2)
	public void yourMessageTest(){
		simpleForm.singleInput(prop.getProperty("message"));
	}
	
	@Test(priority=3)
	public void addTwoInputTest(){
		simpleForm.twoInputAdd(prop.getProperty("value1"), prop.getProperty("value2"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
