package pageObjectsBDD;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableComponentsBDD.BaseClass;

public class TC1_UI extends BaseClass{

	WebDriver driver;

	public TC1_UI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	WebElement searchTab;
	
	@FindBy(xpath = "//main[@class = 'main-content']/div/div/div/div/div/div[3]/div/ul/li")
	List <WebElement> Mug;
	
	@FindBy(xpath = "//*[@id=\"AddToCartForm-292068098089\"]/div[2]/div/span[1]")
	WebElement addQuantity;
	
	@FindBy(xpath = "//*[@name='add']")
	WebElement addToCart;
	
	public WebElement SearchTab() {
		return searchTab;
	}
	
	public List<WebElement> searchMug() {
		return Mug;
	}
	
	public WebElement AddQuantity() {
		return addQuantity;
	}
	
	public WebElement AddToCart() {
		return addToCart;
	}
}


