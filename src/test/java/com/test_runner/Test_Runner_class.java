package com.test_runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.adactin.BaseClass;
import com.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\asaranya\\Downloads\\eclipse-workspace\\adactin\\src\\test\\java\\com\\featurefile\\login.feature",
glue = "C:\\Users\\asaranya\\Downloads\\eclipse-workspace\\adactin\\src\\test\\java\\com\\stepdefinition\\StepDefinitionClass.java",
monochrome = true,
dryRun = false,
strict = true,
tags=("@smokeTest")
//plugin = {"html:Report/Html_Report",
	//	"pretty",
	//	"json:Reports/Cucumber.json",
		//"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"}
)
public class Test_Runner_class {	

	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		
		driver = BaseClass.browserLaunch(browser);
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\asaranya\\Downloads\\eclipse-workspace\\adactin\\Driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://adactinhotelapp.com/index.php");
		//driver.manage().window().maximize();
	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
		
	}
}
	
