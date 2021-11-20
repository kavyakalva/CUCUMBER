package stepDefinitionBDD;

import org.apache.log4j.Logger;

import io.cucumber.java.en.*;
import pageObjectsBDD.TC6_UI;
import reusableComponentsBDD.BaseClass;

public class TC6 extends BaseClass{

	private static Logger log = Logger.getLogger(TC6.class);	

	public static TC6_UI quant ;	
	
	@When("clicks on category")
	public void clicks_on_category() {
		quant = new TC6_UI(driver);
		quant.category().click();
		log.info("New Category");
	}

	@And("selects the gift Item")
	public void selects_the_gift_item() {
		quant.Item().get(0).click();
		log.info("Clicked on the item");
	}

	@Then("increases the quantity of the item")
	public void increases_the_quantity_of_the_item() {
		quant.Quantity().click();
		log.info("increased the quantity to 2");
	}

}
