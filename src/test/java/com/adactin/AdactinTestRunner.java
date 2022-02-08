package com.adactin;

import com.pom_class.BookHotel;
import com.pom_class.LogOut;
import com.pom_class.LoginPagePom;
import com.pom_class.SearchHotelPom;
import com.pom_class.SelectHotelPom;

public class AdactinTestRunner extends BaseClass{
	public static void main(String[] args) {
		browserLaunch("chrome");
		get("https://adactinhotelapp.com/index.php");
		LoginPagePom lp = new LoginPagePom(driver);
		inputValues(lp.getUsername(), "saranyasathyaraj");
		inputValues(lp.getPassword(), "*Sathya#1219");
		elementClick(lp.getLogin());		
		SearchHotelPom shp = new SearchHotelPom(driver);
		dropDown(shp.getLocation(), "visible text", "London");
		dropDown(shp.getHotels(), "value", "Hotel Cornice");
		dropDown(shp.getRoomType(), "index", "1");
		dropDown(shp.getAdult(), "Value", "1");
		dropDown(shp.getChild(), "value", "2");
		elementClick(shp.getSubmit());
		SelectHotelPom sh = new SelectHotelPom(driver);
		radioButton(sh.getHotel());
		elementClick(sh.getConti());
		BookHotel bh = new BookHotel(driver);
		inputValues(bh.getFname(), "Saranya ");
		inputValues(bh.getLname(), "Sathyaraj");
		inputValues(bh.getAddr(), "london");
		inputValues(bh.getCardName(), "1234567890123456");
		dropDown(bh.getCardType(), "value", "VISA");
		dropDown(bh.getMonth(), "value", "3");
		dropDown(bh.getYear(), "value", "2022");
		inputValues(bh.getCvv(), "123");
		elementClick(bh.getClick());
		LogOut l = new LogOut(driver);
		elementClick(l.getLogOut());
		
	}

}
