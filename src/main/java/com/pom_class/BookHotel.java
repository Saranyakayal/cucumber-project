package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public WebDriver driver;
	public BookHotel(WebDriver cde) {
		this.driver = cde;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath ="//input[contains(@name,'first')]")
private WebElement fname;
public WebElement getFname() {
	return fname;
}

@FindBy(xpath="//input[contains(@name,'last')]")
private WebElement lname;
public WebElement getLname() {
	return lname;
}
@FindBy(id = "address")
private WebElement addr;
public WebElement getAddr()
{
	return addr;
}
@FindBy(xpath= "(//input[contains(@name,'num')])[2]")
private WebElement cardName;
public WebElement getCardName()
{
	return cardName;
}
@FindBy(xpath="//select[contains(@class,'combobo')]")
private WebElement cardType;
public WebElement getCardType()
{
	return cardType;
}
@FindBy(xpath="(//select[contains(@class,'select')])[2]")
private WebElement month;
public WebElement getMonth()
{
	return month;
	}
@FindBy(xpath="(//select[contains(@class,'select')])[3]")
private WebElement year;
public WebElement getYear()
{
	return year;
	}
@FindBy(xpath="//input[contains(@name,'cvv')]")
private WebElement cvv;
public WebElement getCvv()
{
	return cvv;
	}
@FindBy(xpath="//input[contains(@name,'book')]")
private WebElement click;
public WebElement getClick()
{
	return click;
	}

}
