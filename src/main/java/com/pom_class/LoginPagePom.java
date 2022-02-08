package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom {

	public WebDriver driver;
	@FindBy(id="username")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public LoginPagePom(WebDriver abc)
	{
		this.driver = abc;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(id="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	

	
	
}
