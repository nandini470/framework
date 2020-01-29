package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.testscripts.Baseclass;


public class AddNewCustomerPage 
{
	public static Logger log;
	@FindBy(name="name")
	private WebElement CustomerNameTextField;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	
	public AddNewCustomerPage()
	{
		log=Logger.getLogger(OpenTaskPage.class);
		PageFactory.initElements(Baseclass.driver,this);
		PropertyConfigurator.configure("log4j.properties");
	}
	public void enterCustomerName(String CustomerName)
	{
		
		CustomerNameTextField.sendKeys(CustomerName);
		log.info("------entered customer name-------");
	}
	public void clickonCreateCustomerButton()
	{
		createCustomerButton.click();
		log.info("------clicked customer button-------");
	}

}
