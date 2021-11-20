package stepDefinitionBDD;

import org.apache.log4j.Logger;

import io.cucumber.java.en.*;
import pageObjectsBDD.TC7_UI;
import reusableComponentsBDD.BaseClass;

public class TC7 extends BaseClass{

	private static Logger log = Logger.getLogger(TC7.class);	

	public static TC7_UI addCard;

	@When("clicking on gift card")
	public void clicking_on_gift_card() {
		addCard = new TC7_UI(driver);
		addCard.GiftCard().click();
		log.info("clicked on gift card");		
	}

	@Then("choosing {int} gift card")
	public void choosing_gift_card(Integer int1) {
		addCard.Amount().click();
		log.info("selected the amount");
	}

	@And("adding it to cart")
	public void adding_it_to_cart() {
		addCard.addToCart().click();
		log.info("added the gift card to the cart");
	}

}
