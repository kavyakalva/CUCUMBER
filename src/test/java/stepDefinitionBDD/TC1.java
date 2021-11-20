package stepDefinitionBDD;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import io.cucumber.java.en.*;
import pageObjectsBDD.TC1_UI;
import reusableComponentsBDD.BaseClass;

public class TC1 extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC1.class);

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws IOException {
		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1BDD\\Configuration\\configBDD.properties");
		prop.load(fis);
		log.info("TestCase 1");
		log.info("Browser has been invoked");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("Landed on Website home page");
	}
	
	public static TC1_UI cm;

	@When("user types coffee mug in search bar")
	public void user_types_coffee_mug_in_search_bar() {
		cm = new TC1_UI(driver);
		cm.SearchTab().sendKeys("coffee Mug");
		log.info("Entered coffee mugs iin search bar");
		cm.SearchTab().sendKeys(Keys.ENTER);
		log.info("clicked on enter");
	}

	@Then("He clicks on a particular coffee mug")
	public void he_clicks_on_a_particular_coffee_mug() {
		cm.searchMug().get(0).click();
		log.info("Clicked on the coffee mug item");
		cm.AddToCart().click();
		log.info("Added Coffee mug to the cart");
	}

}
