package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.actitime.generics.ExcelOperation;
import com.actitime.webpages.ActiveProjectsAndCustomersPage;
import com.actitime.webpages.AddNewProjectPage;
import com.actitime.webpages.OpenTaskPage;

public class CreateNewProjectPage extends Baseclass 
{
	@Test
	public void testCreateProjectTc_05() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//String customername="vegrdfxhg";
		//String projectname="kphb";
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomersLink();
		ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
		apcp.clickonAddNewProjectButton();
		AddNewProjectPage anpp=new AddNewProjectPage();
		anpp.selectCustomerfromDropdown("selenium");
		String pr=ExcelOperation.readData("Sheet1",1,1);
		anpp.enterProjectName(pr);
		
		anpp.clickonCreateProjectButton();
		//String s=apcp.retrivesuccessmessage();
		//System.out.println(s);
	}

}
