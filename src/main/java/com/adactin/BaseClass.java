package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

public static WebDriver driver;
	
	public static WebDriver browserLaunch(String name) {
		
		if(name.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asaranya\\Downloads\\eclipse-workspace\\adactin\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	   driver.manage().window().maximize();
		}
		
		else if(name.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\Chrome\\chromedriver.exe");
			
			driver = new ChromeDriver();
		   driver.manage().window().maximize();
			}
		return driver;
	
	}
	
public static void get(String url) {
		
		driver.get(url);
	}
public static void inputValues(WebElement element, String value) {
	element.sendKeys(value);

}
public static void elementClick(WebElement element) {
	element.click();

}
public static void dropDown(WebElement element, String options, String value) {
	 Select s = new Select(element);
	 if(options.equalsIgnoreCase("value")) {
		 s.selectByValue(value);
	 }
	 else if(options.equalsIgnoreCase("visible text")) {
		 s.selectByVisibleText(value);
	 }
	 else if(options.equalsIgnoreCase("index")) {
		 s.selectByIndex(Integer.parseInt(value));
	 }
		}	
public static void radioButton(WebElement element) {
	element.click();
	
}
	
}
