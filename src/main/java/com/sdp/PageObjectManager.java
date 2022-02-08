package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom_class.BookHotel;
import com.pom_class.LogOut;
import com.pom_class.LoginPagePom;
import com.pom_class.SearchHotelPom;
import com.pom_class.SelectHotelPom;

public class PageObjectManager {
	
	private WebDriver driver;
	LoginPagePom l = new LoginPagePom(driver);
	
	public LoginPagePom getL() {
		return l;
	}
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	SearchHotelPom sh = new SearchHotelPom(driver);
	
	public SearchHotelPom getSh() {
		return sh;
	}
	SelectHotelPom shp = new SelectHotelPom(driver);
	
	public SelectHotelPom getShp() {
		return shp;
	}
	BookHotel b = new BookHotel(driver);

	public BookHotel getB() {
		return b;
	}
	LogOut l1 = new LogOut(driver);

	public LogOut getL1() {
		return l1;
	}
	
}
