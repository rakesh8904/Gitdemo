package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

	public WebDriver driver;
	By email = By.name("email");
	By id = By.id("user_password");
	By login =By.name("commit");
	
	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getemail() {
		return driver.findElement(email);
	}
	public WebElement getpassword() {
		return driver.findElement(id);
	}
	public WebElement clicklogin() {
		return driver.findElement(login);
	}
}
