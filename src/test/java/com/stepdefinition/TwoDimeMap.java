package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TwoDimeMap {
	static WebDriver driver;
	
	@Given("User must in telecom Homepage")
	public void user_must_in_telecom_Homepage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUTHAKAR\\eclipse-workspace\\AddCustomerSteps\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom");
		driver.manage().window().maximize();
	}

	@Given("user to click on Add Customer Button")
	public void user_to_click_on_Add_Customer_Button() {
		WebElement addCustomerClick = driver.findElement(By.xpath("//a[text()='Add Customer']"));
		addCustomerClick.click();
	}

	@When("user need to fill all the personal details")
	public void user_need_to_fill_all_the_personal_details(DataTable cusDetails) {
		List<Map<String, String>> cusMap = cusDetails.asMaps(String.class,String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(cusMap.get(0).get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(cusMap.get(1).get("Lname"));
		driver.findElement(By.id("email")).sendKeys(cusMap.get(2).get("Email"));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(cusMap.get(1).get("Address"));
		driver.findElement(By.id("telephoneno")).sendKeys(cusMap.get(1).get("Mobile"));
	}

	@When("user to click on submit Button")
	public void user_to_click_on_submit_Button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user to see the customer ID is generated or not.")
	public void user_to_see_the_customer_ID_is_generated_or_not() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center']//h3")).isDisplayed());
		WebElement thead = driver.findElement(By.tagName("h3"));
		String text = thead.getText();
		System.out.println(text);
			driver.quit();
	}
}
