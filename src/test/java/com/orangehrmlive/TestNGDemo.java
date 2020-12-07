package com.orangehrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	WebDriver driver;
@BeforeClass
public void openBrowser() {
		System.out.println("opening the browser ");
		System.setProperty("webdriver.chrome.driver", "F:\\ASDM\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
			//System.out.println("Entering the Url");
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");		
	}
/*
	@BeforeClass
	public void enterURL() {
	
		System.out.println("Entering the Url");
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}*/
	
	@BeforeMethod
	public void login() {
		System.out.println("Logging in .");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

	}
	
	
	@Test
	public void adminTest()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Admin")).click();
	}
	
	
	@Test
	public void leaveTest()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Leave")).click();
	}
	
	@Test
	public void pimTest()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Time")).click();
	}
	
	@AfterMethod
	public  void logout()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
	
	

}
