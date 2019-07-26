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

public class TwoDimList {
	static WebDriver driver;

	@Given("User in telecom HomePage")
	public void user_in_telecom_HomePage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUTHAKAR\\eclipse-workspace\\AddCustomerSteps\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom");
	}

	@Given("user need to click on Add customer Button")
	public void user_need_to_click_on_Add_customer_Button() {
		WebElement addCustomerClick = driver.findElement(By.xpath("//a[text()='Add Customer']"));
		addCustomerClick.click();
	}

	@When("user need to fill the personal details")
	public void user_need_to_fill_the_personal_details(io.cucumber.datatable.DataTable cusDetails) {
		List<List<String>> cus = cusDetails.asLists();
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(cus.get(0).get(0));
		driver.findElement(By.id("lname")).sendKeys(cus.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(cus.get(2).get(2));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(cus.get(3).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(cus.get(3).get(4));
	}

	@When("user need to fill all the details")
	public void user_need_to_fill_all_the_details(io.cucumber.datatable.DataTable cusDetails) {
		List<String> cus = cusDetails.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(cus.get(0));
		driver.findElement(By.id("lname")).sendKeys(cus.get(1));
		driver.findElement(By.id("email")).sendKeys(cus.get(2));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(cus.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(cus.get(4));
	}

	@When("user need to click the submit button")
	public void user_need_to_click_the_submit_button() {

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should to see the customer id is generated")
	public void user_should_to_see_the_customer_id_is_generated() {
		//Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center']//h3")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center']//h3")).isDisplayed());
		WebElement thead = driver.findElement(By.tagName("h3"));
		String text = thead.getText();
		System.out.println(text);
	
		driver.quit();

	}	
}


