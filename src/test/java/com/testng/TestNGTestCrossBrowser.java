package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGTestCrossBrowser {
	public WebDriver driver;
	@Test
    @Parameters ({"browser"})
	public void testCrossBrowser(String browser) throws InterruptedException {
		System.out.println("browser name is : "+browser);
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		System.out.println("after setup ");
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Inside chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("Inside edgedriver");
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.google.com/");
		Thread.sleep(6000);
		driver.close();
        
	}
}
