package Cucumber.AutomationFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\malinder.singh\\Automation\\src\\test\\java\\Cucumber\\AutomationFramework\\global.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malinder.singh\\chromedriver.exe");
	    driver = new ChromeDriver();	
	    driver.get(prop.getProperty("url"));
	    return driver;
	}	
}
