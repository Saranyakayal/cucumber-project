package com.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class miniproject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asaranya\\Downloads\\eclipse-workspace\\Seleniumtest\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("saranyasathyaraj");
		driver.findElement(By.id("password")).sendKeys("*Sathya#1219");
		driver.findElement(By.id("login")).click();
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByVisibleText("London");
		WebElement hot = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hot);
		s1.selectByValue("Hotel Cornice");
		WebElement nroom = driver.findElement(By.xpath("(//select[contains(@name,'room')])[2]"));
		Select s2 = new Select(nroom);
		s2.selectByIndex(1);
		WebElement adu = driver.findElement(By.xpath("//select[contains(@name,'adult')]"));
		Select s3 = new Select(adu);
		s3.selectByValue("1");
		WebElement chi = driver.findElement(By.xpath("//select[contains(@name,'child')]"));
		Select s4 = new Select(chi);
		s4.selectByValue("2");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("Saranya");
		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Sathyaraj");
		driver.findElement(By.id("address")).sendKeys("#8, thirumullaivoyal, chennai");
		driver.findElement(By.xpath("(//input[contains(@name,'num')])[2]")).sendKeys("1234567890123456");
		WebElement card = driver.findElement(By.xpath("//select[contains(@class,'combobo')]"));
		Select s5 = new Select(card);
		s5.selectByValue("VISA");
		WebElement mon = driver.findElement(By.xpath("(//select[contains(@class,'select')])[2]"));
		Select s6 = new Select(mon);
		s6.selectByValue("3");
		WebElement year = driver.findElement(By.xpath("(//select[contains(@class,'select')])[3]"));
		Select s7 = new Select(year);
		s7.selectByValue("2022");
		driver.findElement(By.xpath("//input[contains(@name,'cvv')]")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@name,'book')]")).click();
		driver.findElement(By.id("logout")).click();
		
		
	}

}
