package com.lindi.emp.seleniumtests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
	static WebDriver driver;
	
	@BeforeAll
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		 WebDriver driver =  new ChromeDriver ();
		 driver.get("https://localhost:8080/index.html");
		 
	}

	@Test
	public void checkPageTitle() {
		 
		 Assertions.assertEquals("Login", driver.getTitle());
	}

}
