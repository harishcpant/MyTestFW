package com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	
	public WebDriver driver;
	
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		return driver;
	}

}
