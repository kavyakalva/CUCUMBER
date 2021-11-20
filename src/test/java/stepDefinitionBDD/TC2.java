package stepDefinitionBDD;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import pageObjectsBDD.TC2_UI;
import reusableComponentsBDD.BaseClass;

public class TC2 extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC2.class);

	@Given("lands on Homepage")
	public void lands_on_homepage() throws IOException {
		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1BDD\\Configuration\\configBDD.properties");
		prop.load(fis);
		log.info("Browser has been invoked");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("landed on HomePage");
	}
	public static TC2_UI gift ;	
	@When("Hovers on Gifts main menu")
	public void hovers_on_gifts_main_menu() {
		gift = new TC2_UI(driver);
		log.info("Hovered on Gifts dropdown");
		new Actions(driver).moveToElement(gift.giftDD).build().perform();
	}

	@Then("Hovers on Birthday Gifts of subMenu and Clicks")
	public void hovers_on_birthday_gifts_of_sub_menu_and_clicks() {
		log.info("hovered on Birthday gifts and clicked on it");
		new Actions(driver).moveToElement(gift.subDD).click().build().perform();
	}
	
}
