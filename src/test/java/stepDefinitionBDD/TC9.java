package stepDefinitionBDD;

import org.apache.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjectsBDD.TC9_UI;
import reusableComponentsBDD.BaseClass;

public class TC9 extends BaseClass{
	
private static Logger log = Logger.getLogger(TC9.class);	
	
	public static TC9_UI ship;
	public static String text;

	@When("clicks on the link")
	public void clicks_on_the_link() {
		
		ship = new TC9_UI(driver);
		ship.shipping().click();
		log.info("Clicked on the Shipping & deliver Policy link");
	}

	@Then("gets the heading text")
	public void gets_the_heading_text() {
		text = ship.Heading().getText();
		log.info("Got the heading");
	}

	@And("validates using assersions")
	public void validates_using_assersions() {
		try{
			Assert.assertEquals(text, "Shipping & Delivery Policy");
		}catch(AssertionError e){
			System.out.println("not equal");
			throw e;
		}
		log.info("Heading checking done");;
		System.out.println("Equal");
	}

	
}
