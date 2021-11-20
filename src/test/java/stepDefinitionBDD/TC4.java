package stepDefinitionBDD;

import org.apache.log4j.Logger;

import io.cucumber.java.en.*;
import pageObjectsBDD.TC4_UI;
import reusableComponentsBDD.BaseClass;

public class TC4 extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC4.class);	
	
	public static TC4_UI pin;
	
	@When("selects the gift category")
	public void selects_the_gift_category() {
		pin = new TC4_UI(driver);
		pin.category().click();
		log.info("clicked on Top 50 Category");
	}

	@Then("Selects the gift Item")
	public void selects_the_gift_item() {
		pin.Item().get(0).click();
		log.info("Selected the Item");
	}

	@Then("Enters the Pincode")
	public void enters_the_pincode() {
		pin.pinCode().sendKeys("123456");
		log.info("Entered the pincode");
	}

	@Then("Clicks on check button")
	public void clicks_on_check_button() {
		pin.Check().click();
		log.info("Clicked on check");
	}
}
