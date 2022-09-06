package com.web;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BDDTestOne {
	@Given("Open Amazon website")
	public void open_Facebook_website() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();		
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		driver.quit();
	}

}
