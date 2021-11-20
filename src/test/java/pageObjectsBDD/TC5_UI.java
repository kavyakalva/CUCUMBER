package pageObjectsBDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC5_UI {

	WebDriver driver;

	public TC5_UI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\'myheader\']/div[1]/div/div/ul/li[10]/a")
	WebElement mainMenu;
	
	@FindBy(xpath = "//*[@id=\'myheader\']/div[1]/div/div/ul/li[10]/ul/li[6]/a")
	WebElement subMenu;
	
	public WebElement mainMenu() {
		return mainMenu;
	}
	public WebElement subMenu() {
		return subMenu;
	}
	
}
