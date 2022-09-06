package com.testng;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.common.TestBaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTestOne extends TestNGBaseClass {
  @Test
  public void f() throws InterruptedException {
	  System.out.println("This is a TestNgTestOne class...");
	  	driver.get("http://google.com");
	  	int a=10/0;
		Thread.sleep(5000);
		Assert.assertTrue(false);		
  }
}
