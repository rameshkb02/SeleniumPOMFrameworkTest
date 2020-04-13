package com.sel.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sel.qa.base.TestBase;
import com.sel.qa.pages.DemoHome;
import com.sel.qa.pages.RadioButtonDemo;

public class RadioButtonPageTest extends TestBase{
	
	DemoHome demoHome;
	RadioButtonDemo radioButton;
	
	public RadioButtonPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		demoHome= new DemoHome();
		radioButton = new RadioButtonDemo();
		demoHome.navigateRadioButtonDemo();
	}
	
	@Test
	public void radioButtonDemoPageTitleTest() {
		String title = radioButton.radioButtonPageTitle();
		Assert.assertEquals(title, "Selenium Easy Demo - Radio buttons demo for Automation","Title Mismatch");
	}
	
	@Test
	public void singleRBTest()
	{
		try {
			radioButton.singleRB();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void groupRBTest()
	{
		try {
			radioButton.groupRB();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
