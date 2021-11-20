package pageObjectsBDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC10_UI {
	
	WebDriver driver;

	public TC10_UI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Corporate Gifts")
	WebElement Category;
	
	@FindBy(id = "contactFormName")
	WebElement FullName;
	
	@FindBy(id = "contactFormEmail")
	WebElement Email;
	
	@FindBy(id = "contactFormPhone")
	WebElement Number;
	
	@FindBy(id = "contactFormMessage")
	WebElement Enquiry;
	
	@FindBy(xpath = "//*[@id=\'contactFormWrapper\']/div/input[4]")
	WebElement Submit;
	
	public WebElement Category() {
		return Category;
	}
	public WebElement FullName() {
		return FullName;
	}
	public WebElement Email() {
		return Email;
	}
	public WebElement Number() {
		return Number;
	}
	public WebElement enuiry() {
		return Enquiry;
	}
	public WebElement Submit() {
		return Submit;
	}
}
