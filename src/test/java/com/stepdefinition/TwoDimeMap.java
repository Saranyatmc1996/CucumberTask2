package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwoDimeMap {
	static WebDriver driver;
	@Given("user must in telecom page")
	public void user_must_in_telecom_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUTHAKAR\\eclipse-workspace\\AddCustomerSteps\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom"); 
	}

	@Given("user need to click add tariff button")
	public void user_need_to_click_add_tariff_button() {
		WebElement Trariffclk = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		  Trariffclk.click();
	}

	@When("user need to fill all the tariff details")
	public void user_need_to_fill_all_the_tariff_details(io.cucumber.datatable.DataTable addTariff) 
	{List<Map<String, String>> add = addTariff.asMaps();
	
	driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(add.get(0).get("monRen"));
	driver.findElement(By.id("local_minutes")).sendKeys(add.get(1).get("fLocalMins"));
	driver.findElement(By.id("inter_minutes")).sendKeys(add.get(1).get("fInterins"));
	driver.findElement(By.id("sms_pack")).sendKeys(add.get(2).get("fSmsPack"));
	driver.findElement(By.id("minutes_charges")).sendKeys(add.get(0).get("lCharg"));
	driver.findElement(By.id("inter_charges")).sendKeys(add.get(2).get("InterCharg"));
	driver.findElement(By.id("sms_charges")).sendKeys(add.get(0).get("smsCharg"));
	}

	@When("user need to click submit btn")
	public void user_need_to_click_submit_btn() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should see the successfully completed page")
	public void user_should_see_the_successfully_completed_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		driver.quit();
	}


}
