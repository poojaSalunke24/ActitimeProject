package Com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com.Actitime.Pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	FileLibrary f1=new FileLibrary();
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("Database connected successfully",true);
	}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database disconnected successfully",true);
	}
	@BeforeClass
	public void launchBrowser() throws IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
          driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           String URL = f1.readDataFromProperty("URL");
           driver.get(URL);
           Reporter.log("launched browser",true);
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
		Reporter.log("browser closed",true);
	}
	@BeforeMethod
	public void Login()throws IOException {
		String un = f1.readDataFromProperty("username");
		String pw = f1.readDataFromProperty("password");
		LoginPage lp=new LoginPage(driver);
		lp.getUntbx().sendKeys(null);
		lp.getPwtbx().sendKeys(pw);
		lp.getLoginbutton().click();
		Reporter.log("logged is successfully",true);
 	}
	@AfterMethod
	public void Logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logged out",true);
	}
	

}
