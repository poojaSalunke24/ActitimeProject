package Com.Actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	//declaration
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewbt;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customername;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdescription;
	
	@FindBy(xpath = "div[.='Create Customer']")
	private WebElement createcust;
	
	//initialization
	public TasksPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization

	public WebElement getAddnewbt() {
		return addnewbt;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustomername() {
		return customername;
	}

	public WebElement getCustdescription() {
		return custdescription;
	}

	public WebElement getCreatecust() {
		return createcust;
	}
 
	
	
}
