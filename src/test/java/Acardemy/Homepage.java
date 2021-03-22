package Acardemy;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.Landingpage;
import Pageobjects.loginpage;
import Resources.base;

public class Homepage extends base {
	@BeforeTest 
	public void initlize() throws IOException {
		driver = initializeDriver();
		//driver.get("http://www.qaclickacademy.com/");
		driver.get(prop.getProperty("url"));
		
	}
	@Test
	public void basepagenavigation() throws IOException {
		//driver = initializeDriver();
		//driver.get("http://www.qaclickacademy.com/");
		//driver.get(prop.getProperty("url"));
		Landingpage lan = new Landingpage(driver);
		lan.clicknewsletter().click();
		String tit = lan.gettitle().getText();
		String act = "FEATURED COURSES";
		Assert.assertEquals(tit, act);
		boolean w =lan.linkvalidation().isDisplayed();
		Assert.assertTrue(w);
		
		
	}
	@AfterTest
	public void closebrowser() {
		driver.close();
	}
}
