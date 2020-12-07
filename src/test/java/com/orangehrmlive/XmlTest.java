package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlTest {
	@Parameters({"uname","pass"})
	@Test
  public void paraTest(String user,String pwd) {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\ASDM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
			//System.out.println("Entering the Url");
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");	
			
			
			driver.findElement(By.name(user)).sendKeys("Admin");
			
			driver.findElement(By.id(pwd)).sendKeys("admin123");
			
		//	driver.findElement(By.name("Submit")).click();

			
			
			
			
  }
}
