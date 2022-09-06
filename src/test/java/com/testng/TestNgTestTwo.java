package com.testng;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.common.TestBaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTestTwo extends TestNGBaseClass {
  @Test
  public void f()  throws InterruptedException {
	  System.out.println("This is a TestNgTestTwo class...");
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		Assert.assertTrue(true);
  }
}


