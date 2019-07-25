package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class CustomerOneDimList {
	static WebDriver driver;
	@Given("User in telecom home pages.")
	public void user_in_telecom_home_pages() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUTHAKAR\\eclipse-workspace\\AddCustomerSteps\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom");
	}

	@Given("user need to click on Add Customer btn.")
	public void user_need_to_click_on_Add_Customer_btn() {
		WebElement addCustomerClick = driver.findElement(By.xpath("//a[text()='Add Customer']"));
		addCustomerClick.click();
	}

	@When("user need to fill all the details.")
	public void user_need_to_fill_all_the_details(DataTable cusDetails) {
		List<String> cus = cusDetails.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(cus.get(0));
		driver.findElement(By.id("lname")).sendKeys(cus.get(1));
		driver.findElement(By.id("email")).sendKeys(cus.get(2));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(cus.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(cus.get(4));
	}

	@When("user need to click submit btn.")
	public void user_need_to_click_submit_btn() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should see the customer id is generated or not.")
	public void user_should_see_the_customer_id_is_generated_or_not() {
		//Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center']//h3")).isDisplayed());
		WebElement cusId = driver.findElement(By.xpath("//td[@align='center']//h3"));
		String text = cusId.getAttribute("value");
		System.out.println(text);
		driver.quit();
	}


}
