package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.testscripts.Baseclass;


public class OpenTaskPage 
{
	public static Logger log;
	@FindBy(linkText="Settings")
	private WebElement SettingsLink;
	@FindBy(linkText="Projects & Customers")
	private WebElement projectAndCustomersLink;
	
	
	
	public OpenTaskPage()
	{
		log=Logger.getLogger(OpenTaskPage.class);
		PageFactory.initElements(Baseclass.driver,this);
		PropertyConfigurator.configure("log4j.properties");
		}
	public void clickonSettingsLink()
	{
		log.info("------settings link-------");
		SettingsLink.click();
	}
	public void clickOnProjectsAndCustomersLink()
	{
		log.info("-------project and customer link opened-------");
		projectAndCustomersLink.click();	
	}

}
