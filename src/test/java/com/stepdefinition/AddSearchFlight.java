package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddSearchFlight {
	static WebDriver driver;
	@Given("User in eurowings ailines home page")
	public void user_in_eurowings_ailines_home_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUTHAKAR\\eclipse-workspace\\AddCustomerSteps\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.eurowings.com/en.html");
	}

	@Given("user need to click the fligt otion")
	public void user_need_to_click_the_fligt_otion() {
	 WebElement search = driver.findElement(By.xpath("(//span[@class='o-tab-container__tab-button'])[1]"));
	 search.click();
	}

	@When("user need to fill all the details under flight option")
	public void user_need_to_fill_all_the_details_under_flight_option() {
//	   WebElement src = driver.findElement(By.id("//input[@id='gid-autocomplete-1-input']"));
//	   src.click();
	   WebElement srcClk = driver.findElement(By.xpath("(//span[@class='a-textlink a-textlink--small'])[2]"));
	   srcClk.click();
	   WebElement des = driver.findElement(By.xpath("//input[@id='gid-autocomplete-2-input']"));
	   des.click();
	   WebElement desClk = driver.findElement(By.xpath("(//span[@class='a-textlink a-textlink--small'])[2]"));
	   desClk.click();
	   WebElement outFlightDate = driver.findElement(By.xpath("//input[@id='gid-mask-1-input']"));
	   outFlightDate.click();  
	   WebElement OutGoingOnly = driver.findElement(By.xpath("//input[@id='form-radiobutton-1559-0']"));
	   OutGoingOnly.click();
	   	WebElement dateSelect = driver.findElement(By.xpath("(//input[@type='radio'])[50]"));
	   	dateSelect.click();
	   
	}

	@When("need to click on search flight button")
	public void need_to_click_on_search_flight_button() {
		
		WebElement searchFlight = driver.findElement(By.xpath("(//button[@type='button'])[15]"));
	   	searchFlight.click();
		
	   
	}

	@Then("user should see the list of flights")
	public void user_should_see_the_list_of_flights() {
	   
		
		
	}



}
