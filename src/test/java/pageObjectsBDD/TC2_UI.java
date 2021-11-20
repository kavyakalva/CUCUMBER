package pageObjectsBDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC2_UI {

	WebDriver driver;

	public TC2_UI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\'myheader\']/div[1]/div/div/ul/li[7]/a")
	public
	WebElement giftDD;
	
	@FindBy(linkText = "Birthday Gifts")
	public
	WebElement subDD;
	
	public WebElement MainDown() {
		return giftDD;
	}	
	public WebElement SubDD() {
		return subDD;
	}
}
