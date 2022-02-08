package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPom {
	@FindBy(id="location")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}

	public WebDriver driver;
		
	public SearchHotelPom( WebDriver ijk) {
		this.driver = ijk;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}
	@FindBy(xpath="(//select[contains(@name,'room')])[2]")
	private WebElement roomType;

	public WebElement getRoomType() {
		return roomType;
	}
	
	@FindBy(xpath= "//select[contains(@name,'adult')]")
	private WebElement adult;

	public WebElement getAdult() {
		return adult;
	}

	@FindBy(xpath= "//select[contains(@name,'child')]")
	private WebElement child;
	
	public WebElement getChild() {
		return child;
	}

	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
}
