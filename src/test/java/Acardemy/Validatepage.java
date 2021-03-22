package Acardemy;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.Landingpage;
import Pageobjects.loginpage;
import Resources.base;

public class Validatepage extends base {
	//@BeforeTest(dataProvider = "getdata")
	//public void initlize() throws IOException {
	//	driver = initializeDriver();
		//driver.get("http://www.qaclickacademy.com/");
		//driver.get(prop.getProperty("url"));
	
		
	@Test(dataProvider = "getdata")
	public void basepagenavigation(String username,String password) throws IOException {
		driver = initializeDriver();
		//driver.get("http://www.qaclickacademy.com/");
		driver.get(prop.getProperty("url"));
		Landingpage lan = new Landingpage(driver);
		lan.clicknewsletter().click();
		lan.getlogin().click();
		loginpage log = new loginpage(driver);
		log.getemail().sendKeys(username);
		log.getpassword().sendKeys(password);
		log.clicklogin().click();
	}
@DataProvider
public Object[][] getdata() {
	Object[][] obj = new Object[2][2];
	obj[0][0]= "abc@gmail.com";
	obj[0][1]= "12345";
	
	obj[1][0]= "cde@gmail.com";
	obj[1][1]= "8783";
	return obj;
	
	
	
}
@AfterTest
public void closebrowser() {
	driver.close();
}
}
