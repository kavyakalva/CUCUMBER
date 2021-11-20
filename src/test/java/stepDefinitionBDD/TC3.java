package stepDefinitionBDD;

import org.apache.log4j.Logger;

import io.cucumber.java.en.*;
import pageObjectsBDD.TC3_UI;
import reusableComponentsBDD.BaseClass;

public class TC3 extends BaseClass{

	private static Logger log = Logger.getLogger(TC3.class);
	
	public static TC3_UI Cgift;

	@When("Selects the Gift Category")
	public void selects_the_gift_category() {
		Cgift = new TC3_UI(driver);
		Cgift.chrisGift().click();
		log.info("clicked on Christmas gifts");
	}

	@And("Selects a gift Item")
	public void selects_a_gift_item() {
		Cgift.GiftItem().get(1).click();
		log.info("Selected the required item");
	}

	@Then("Adds the gift item into the cart")
	public void adds_the_gift_item_into_the_cart() {
		Cgift.addToCart().click();
		log.info("Added the Item to the cart");
	}

	@And("Adds the Gift card to the selected items")
	public void adds_the_gift_card_to_the_selected_items() throws InterruptedException {
		Thread.sleep(5000);
		Cgift.GiftCard().click();
		log.info("Added a gift note to it");
	}
}
