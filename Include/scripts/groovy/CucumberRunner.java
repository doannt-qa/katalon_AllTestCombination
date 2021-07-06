
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:bdd-report/cucumber.json","html:bdd-report"}, glue = "", features = "Include/features/Register.feature") 
public class CucumberRunner {

}
