package co.com.test2.stepdefinitions;

import co.com.test2.enums.ConstanstString;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class ToolsQAStep {


    @Before
    public void initialConfig(){
        setTheStage(new OnlineCast());
    }

    @Given("{string} want enter the data in the form")
    public void wantEnterTheDataInTheForm(String customer) {
        theActor(customer).wasAbleTo(new OpenUrl(ConstanstString.URL.getValue()));
    }

    @When("enter the request information")
    public void enterTheRequestInformation(List<Map<String,String>> data) {

    }

    @Then("should see the message {string}")
    public void shouldSeeTheMessage(String string) {

    }


}
