package Com.Actitime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.Actitime.GenericLibrary.BaseClass;
import Com.Actitime.GenericLibrary.FileLibrary;
import Com.Actitime.Pom.HomePage;
import Com.Actitime.Pom.TasksPage;

public class TaskTest extends BaseClass{
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getTasklink().click();
		TasksPage tp=new TasksPage(driver);
		tp.getAddnewbt().click();
		tp.getNewcust().click();
		FileLibrary f=new FileLibrary();
		 String name = f.readDataFromExcelFile("Sheet1",4, 0);
		 tp.getCustomername().sendKeys(name);
		String description = f.readDataFromExcelFile("Sheet1", 4, 2);
		tp.getCustdescription().sendKeys(description);
		tp.getCreatecust().click();
		
	}

}
