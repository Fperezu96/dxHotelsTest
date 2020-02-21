package co.com.certification.dxHotels.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/bookAHotel.feature",
        glue = "co.com.certification.dxHotels.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class booAHotel {

}
