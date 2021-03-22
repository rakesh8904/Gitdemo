package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver() throws IOException {
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\shankar\\eclipse-workspace\\Scratchtoend\\src\\main\\java\\Resources\\data.properties");
	prop.load(fis);
	prop.getProperty("browser");
	String browsername = prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shankar\\Documents\\selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	else if(browsername =="firefox") {
		
	}
	else if(browsername =="ie") {
		
	}
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	

}
