package com.actitime.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass 
{	
	public static WebDriver driver;			//declaration
@BeforeTest
public void openBrowser()
{
	String browser="chrome";
	if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","c://drivers//chromedriver.exe");
		driver=new ChromeDriver();			//initialization
	}
	else if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko,driver", "c://drivers//geckoDriver.exe");
		driver=new FirefoxDriver();
	}
	driver.get("http://raja:81/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
@AfterTest
public void CloseBrowser()
{
	driver.close();
}
@BeforeClass
public void Login()
{
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
@AfterClass
public void Logout()
{
driver.findElement(By.className("logoutImg")).click();
}


}
