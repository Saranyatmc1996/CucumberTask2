package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffClass {
	static WebDriver driver;
	@Given("user in telecom page")
	public void user_in_telecom_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUTHAKAR\\eclipse-workspace\\AddCustomerSteps\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom"); 
	}

	@Given("need to click add tariff button")
	public void need_to_click_add_tariff_button() {
	  WebElement Trariffclk = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
	  Trariffclk.click();
	}

	@When("need to fill all the details")
	public void need_to_fill_all_the_details(DataTable addTariff) {
		List<String> add = addTariff.asList(String.class);
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(add.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(add.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(add.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(add.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(add.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(add.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(add.get(6));
	}

	@When("need to click submit button")
	public void need_to_click_submit_button() {
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should see the successfully compeletion page")
	public void user_should_see_the_successfully_compeletion_page() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='button']")).click();
	}


}
