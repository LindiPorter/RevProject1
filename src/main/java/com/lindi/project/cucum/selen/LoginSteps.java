package com.lindi.project.cucum.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	public static WebDriver driver; 
	@Given("User is on Index Page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://localhost:8080/index.html");
		
}

	@When("User Navigate to Login Page")
	public void user_navigate_to_log_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Title of the Page is : "+driver.getTitle());
	}

	//@When("User enters Username and Password")
	//public void user_enters_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    /*WebElement uname = driver.findElement(By.id("userName"));
	    WebElement password = driver.findElement(By.id("password"));
	    WebElement loginBtn = driver.findElement(By.id("login"));
	    uname.sendKeys("testuser");
	    password.sendKeys("Password@123");
	    loginBtn.click();*/
	//}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		WebElement uname = driver.findElement(By.id("username"));
		WebElement password1 = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login"));
		uname.sendKeys(username);
		password1.sendKeys(password);
		loginBtn.click();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Login Successful....");
	   //driver.quit(;)
}
}
