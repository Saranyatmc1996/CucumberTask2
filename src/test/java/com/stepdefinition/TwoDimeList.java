package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwoDimeList {
	static WebDriver driver;
	@Given("user should in telecom home page")
	public void user_should_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUTHAKAR\\eclipse-workspace\\AddCustomerSteps\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom"); 
	}

	@Given("need to click a add Tarifff button")
	public void need_to_click_a_add_Tarifff_button() {
		WebElement Trariffclk = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		  Trariffclk.click();
	}

	@When("need to fill all the tariff details")
	public void need_to_fill_all_the_tariff_details(io.cucumber.datatable.DataTable addTariff) {
		List<List<String>> add = addTariff.asLists();
		
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(add.get(1).get(2));
		driver.findElement(By.id("local_minutes")).sendKeys(add.get(1).get(2));
		driver.findElement(By.id("inter_minutes")).sendKeys(add.get(2).get(1));
		driver.findElement(By.id("sms_pack")).sendKeys(add.get(3).get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(add.get(2).get(2));
		driver.findElement(By.id("inter_charges")).sendKeys(add.get(2).get(3));
		driver.findElement(By.id("sms_charges")).sendKeys(add.get(1).get(0));
	}
	@When("need to fill all the tariff detailss")
	public void need_to_fill_all_the_tariff_detailss(io.cucumber.datatable.DataTable addTariff) {
		List<String> add = addTariff.asList(String.class);
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(add.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(add.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(add.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(add.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(add.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(add.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(add.get(6));
	}
	@When("need to click the submit button")
	public void need_to_click_the_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should see the successfully completed Page")
	public void user_should_see_the_successfully_completed_Page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		driver.quit();
	}


}
