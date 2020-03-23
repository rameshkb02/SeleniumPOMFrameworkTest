package com.sel.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sel.qa.base.TestBase;
import com.sel.qa.pages.DemoHome;
import com.sel.qa.pages.SimpleFormDemo;

public class DemoHomePageTest extends TestBase {

	DemoHome demoHome;
	SimpleFormDemo simpleForm;

	public DemoHomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		demoHome = new DemoHome();
	}

	@Test(priority = 1)
	public void demoHomePageTitleTest() {
		String title = demoHome.validateDemoHomePageTitle();
		Assert.assertEquals(title, "Selenium Easy - Best Demo website to practice Selenium Webdriver Online","Title not matched");
	}

	@Test(priority = 2)
	public void selEasyImageTest() {
		boolean flag = demoHome.validateSelEasyImage();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void validateInputFormsDD() {
		boolean flag = demoHome.validateInputFormsOption();
		Assert.assertTrue(flag);
	}

	@Test(priority = 4)
	public void navigateSimpleFormTest() {
		simpleForm = demoHome.navigateSimpleForm();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
