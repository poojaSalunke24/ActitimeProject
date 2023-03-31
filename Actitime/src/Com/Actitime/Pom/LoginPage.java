package Com.Actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(id="username")
	private WebElement Untbx;
	
	@FindBy(name="pwd")
	private WebElement Pwtbx;
	
	@FindBy(xpath ="//div[.='Login ']")
	private WebElement Loginbutton;
	 
	//initialization
	//Create constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
			}
	//utilization

	public WebElement getUntbx() {
		return Untbx;
	}

	public WebElement getPwtbx() {
		return Pwtbx;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	

}
