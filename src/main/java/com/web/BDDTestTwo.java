package com.web;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BDDTestTwo {
	@Given("Open Flipkart website")
	public void open_Facebook_website() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
		driver.quit();
	}
}
