package com.testng;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.common.*;

public class TestNGTestListener implements ITestListener {
	private WebDriver driver;
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure invoked..");
		this.driver = ((TestNGBaseClass)result.getInstance()).driver;
//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "/Screenshots/TestFailure.png"));
//		} catch (IOException e) {}
//		
		PageSnapshot snap = Shutterbug.shootPage(driver, Capture.FULL);
		
		String currentDateTime=LocalDateTime.now().getDayOfMonth() 
    			+ "-"
    			+ LocalDateTime.now().getDayOfMonth() 
    			+ "-"
    			+ LocalDateTime.now().getMonthValue() 
    			+ "-"
    			+ LocalDateTime.now().getYear() 
    			+ "-"
    			+ LocalDateTime.now().getHour() 
    			+ "-"
    			+ LocalDateTime.now().getMinute() 
    			+ "-"
    			+ LocalDateTime.now().getSecond();

		try {
			ImageIO.write(snap.getImage(), "PNG", new File(System.getProperty("user.dir") + "/Screenshots/shutterBug-Failure-"+currentDateTime+".png"));
		} catch (IOException e) {}		
    }
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess invoked..");
		this.driver = ((TestNGBaseClass)result.getInstance()).driver;
//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "/Screenshots/TestFailure.png"));
//		} catch (IOException e) {}
//		
		PageSnapshot snap = Shutterbug.shootPage(driver, Capture.FULL);
		
		String currentDateTime=LocalDateTime.now().getDayOfMonth() 
    			+ "-"
    			+ LocalDateTime.now().getDayOfMonth() 
    			+ "-"
    			+ LocalDateTime.now().getMonthValue() 
    			+ "-"
    			+ LocalDateTime.now().getYear() 
    			+ "-"
    			+ LocalDateTime.now().getHour() 
    			+ "-"
    			+ LocalDateTime.now().getMinute() 
    			+ "-"
    			+ LocalDateTime.now().getSecond();

		try {
			ImageIO.write(snap.getImage(), "PNG", new File(System.getProperty("user.dir") + "/Screenshots/shutterBug-Success-"+currentDateTime+".png"));
		} catch (IOException e) {}	
    }

	@Override
	public void onTestStart(ITestResult result) {}

	@Override
	public void onTestSkipped(ITestResult result) {}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

	@Override
	public void onStart(ITestContext context) {}

	@Override
	public void onFinish(ITestContext context) {}
	
}
