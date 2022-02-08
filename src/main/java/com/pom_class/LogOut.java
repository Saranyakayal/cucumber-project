package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

	public WebDriver driver;
	public LogOut(WebDriver xyz) {
		this.driver = xyz;
		PageFactory.initElements(driver, this);
		
	}
	private WebElement logOut;
	public WebElement getLogOut() {
		return logOut;
	}
	
}
