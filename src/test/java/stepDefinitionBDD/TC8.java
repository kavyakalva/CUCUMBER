package stepDefinitionBDD;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import io.cucumber.java.en.*;
import pageObjectsBDD.TC8_UI;
import reusableComponentsBDD.BaseClass;

public class TC8 extends BaseClass{
	
private static Logger log = Logger.getLogger(TC5.class);	
	
	public static TC8_UI wish;

	@When("click on a particular category")
	public void click_on_a_particular_category() {
		wish = new TC8_UI(driver);
		log.info("landed on All of It page");
		wish.Category().click();
	}

	@Then("Select the item")
	public void select_the_item() {
		wish.Item().get(0).click();
		log.info("Selected the item");
	}
	

	@Then("add the item to wishlist")
	public void add_the_item_to_wishlist() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wish.addToWhish().click();
		log.info("added to wish list");
	}
	
}
