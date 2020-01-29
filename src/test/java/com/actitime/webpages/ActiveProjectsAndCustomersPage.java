package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.testscripts.Baseclass;


public class ActiveProjectsAndCustomersPage
{
	public static Logger log;
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement AddNewProjectButton;

	@FindBy(className="successmsg")
	private WebElement successmessage;
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	
	public ActiveProjectsAndCustomersPage()
	{
		
		log=Logger.getLogger(OpenTaskPage.class);
		PageFactory.initElements(Baseclass.driver,this);
		PropertyConfigurator.configure("log4j.properties");
	}
	public void clickonAddNewProjectButton()
	{
		
		AddNewProjectButton.click();
		log.info("-----clicked on project button-------");
	}
	public void clickOnAddNewCustomerButton()
	{
		addNewCustomerButton.click();
		log.info("-----clicked on customer button-------");
	}
	public String retrivesuccessmessage()
	{
		String s=successmessage.getText();
		log.info("------success msg retrived--------");
		return s;
	
	}


}
