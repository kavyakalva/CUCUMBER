package runnerBDD;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\NITIN\\eclipse-workspace\\Question1BDD\\src\\test\\java\\features",
		glue = {"stepDefinitionBDD"},
		dryRun = false,
		monochrome = true)
public class Runner extends AbstractTestNGCucumberTests{

}
