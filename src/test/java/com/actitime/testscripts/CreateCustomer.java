package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.actitime.generics.ExcelOperation;
import com.actitime.webpages.ActiveProjectsAndCustomersPage;
import com.actitime.webpages.AddNewCustomerPage;
import com.actitime.webpages.OpenTaskPage;


public class CreateCustomer extends Baseclass
{
	@Test
	public void testCreateCustomerTc_04() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//String customername="qsphyd";
		OpenTaskPage opt=new OpenTaskPage();
		opt.clickOnProjectsAndCustomersLink();
		ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
		apcp.clickOnAddNewCustomerButton();
		AddNewCustomerPage ancp=new AddNewCustomerPage();
		String cun=ExcelOperation.readData("Sheet1",1,0);
		ancp.enterCustomerName(cun);
		
		ancp.clickonCreateCustomerButton();
		String s=apcp.retrivesuccessmessage();
		System.out.println(s);
		
	}


}
