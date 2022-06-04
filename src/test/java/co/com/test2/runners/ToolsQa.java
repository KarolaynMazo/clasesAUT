package co.com.test2.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.com.test2.stepdefinitions",
        features = "src/test/resources/features/tools_qa.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ToolsQa {


}
