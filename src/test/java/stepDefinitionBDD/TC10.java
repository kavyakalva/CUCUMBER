package stepDefinitionBDD;

import org.apache.log4j.Logger;

import io.cucumber.java.en.*;
import pageObjectsBDD.TC10_UI;
import reusableComponentsBDD.BaseClass;

public class TC10 extends BaseClass{
	
private static Logger log = Logger.getLogger(TC5.class);	
	
	public static TC10_UI cg;

	@When("clicks on corporate gift")
	public void clicks_on_corporate_gift() {
		cg = new TC10_UI(driver);
		cg.Category().click();
		log.info("Clicked on Corporate Gift");
	}

	@Then("^enters the (.+) (.+) (.+) (.+) details$")
	public void enters_the_full_name_email_number_enquiry_details(String FullName, String Email, String Number, String Enquiry ) {
		cg.FullName().sendKeys(FullName);
		log.info("Entered the name");
		cg.Email().sendKeys(Email);
		log.info("Entered the Email");
		cg.Number().sendKeys(Number);
		log.info("Entered the number");
		cg.enuiry().sendKeys(Enquiry);
		log.info("Entered the enquiry text");
	}

	@Then("click submit")
	public void click_submit() {
		cg.Submit().click();
		log.info("Clicked on subit button");
	}
	
}
