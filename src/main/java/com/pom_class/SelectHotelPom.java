package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPom {

	public WebDriver driver;
	@FindBy(xpath = "(//input[@type='radio'])[4]")
	private WebElement hotel;
	public WebElement getHotel() {
		return hotel;
	}
	public SelectHotelPom(WebDriver efg) {
		this.driver = efg;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="continue")
	private WebElement conti;
	public WebElement getConti() {
		return conti;
	}
	
	

}
