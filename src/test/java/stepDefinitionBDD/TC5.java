package stepDefinitionBDD;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import pageObjectsBDD.TC5_UI;
import reusableComponentsBDD.BaseClass;

public class TC5 extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC5.class);	
	
	public static TC5_UI bday;
	
	@When("hovers on Birthday Gifts")
	public void hovers_on_birthday_gifts() {
		bday = new TC5_UI(driver);
		new Actions(driver).moveToElement(bday.mainMenu()).build().perform();
		log.info("Hovered on Birthday gifts");
	}

	@Then("Clicks on 18th Bday gift")
	public void clicks_on_18th_bday_gift() {
		new Actions(driver).moveToElement(bday.subMenu()).click().build().perform();
		log.info("Hovered on 18th birthday gifts and clicked on it");
	}



	
}
