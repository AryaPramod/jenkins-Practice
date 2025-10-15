package com.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DemoLoginSteps {
	WebDriver driver=Hooks.driver;

	@Given("user on login page")
	public void user_on_login_page() {
	    System.out.println("the user is on the sauce demo login page");
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
	   // loginBtn.click();
	}



	@When("entering valid username {string} and password {string}")
	public void entering_valid_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("entering valid username and page");
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		
	}

	@Then("dashboard page is displayed")
	public void dashboard_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("dashboard page is displayed");
	}

	@When("invalid  credentials {string} and {string}")
	public void invalid_credentials_and(String username, String password) {
		// Write code here that turns the phrase above into concrete actions

		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		//lp.btnclick();
	}
	@Then("still in login page")
	public void still_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Login Page");
	}



	@When("from the login {string} and {string} navigate to add to cart is clicked on a product")
	public void from_the_login_and_navigate_to_add_to_cart_is_clicked_on_a_product(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		//lp.btnclick();  

	}

	@When("add to cart is clicked on a product")
	public void add_to_cart_is_clicked_on_a_product() {
		// Write code here that turns the phrase above into concrete actions
		LoginPage lp = new LoginPage(driver);
		
		lp.cartitem();
		System.out.println("item is added");

	}

	@Then("cart page is opened")
	public void cart_page_is_opened() {
		// Write code here that turns the phrase above into concrete actions
		
		LoginPage lp = new LoginPage(driver);
		
		lp.openCart();
		//driver.get("https:// www.saucedemo.com/cart.html");
		System.out.println("cart is shown");

	}

}
