package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actitime.testscripts.Baseclass;



public class AddNewProjectPage
{
	public static Logger log;
	@FindBy(name="customerId")
	private WebElement CustomerDropdown;
	
	@FindBy(name="name")
	private WebElement ProjectNameTextField;
	
	@FindBy(name="createProjectSubmit")
	private WebElement CreateProjectButton;
	public AddNewProjectPage()
	{
		log=Logger.getLogger(OpenTaskPage.class);
		PageFactory.initElements(Baseclass.driver,this);
		PropertyConfigurator.configure("log4j.properties");
		}
	public void selectCustomerfromDropdown(String customerName)
	{
		Select s1=new Select(CustomerDropdown);
		s1.selectByVisibleText(customerName);
		log.info("-----select customer from the dropdown-----");
		}
	public void enterProjectName(String ProjectName)
	{
		ProjectNameTextField.sendKeys(ProjectName);
		log.info("-----entered project name-------");
	}
	public void clickonCreateProjectButton()
	{
		CreateProjectButton.click();
		log.info("------clicked on project button-------");
	}

}
