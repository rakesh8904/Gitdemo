package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	
		// TODO Auto-generated constructor stub
By Loginpage=	By.xpath("//span[text()='Login']");
By newletter = By.xpath("//button[text()='NO THANKS']");
By title = By.xpath("//h2[text()='Featured Courses']");
By link = By.xpath("//a[text()='Contact']");


public Landingpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}



public WebElement getlogin() {
	return driver.findElement(Loginpage);
	
}
public WebElement clicknewsletter() {
	return driver.findElement(newletter);
	
}
public WebElement gettitle() {
	return driver.findElement(title);
	
}
public WebElement linkvalidation() {
	return driver.findElement(link);
	
}

	}


