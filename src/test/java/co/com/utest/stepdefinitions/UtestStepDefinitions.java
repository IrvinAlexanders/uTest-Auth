package co.com.utest.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import com.utest.certification.testing.model.UserData;
import com.utest.certification.testing.questions.Answer;
import com.utest.certification.testing.task.UtestCreateSection;
import com.utest.certification.testing.task.OpenUp;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that user wants to create an account$")
    public void thatUserWantsToCreateAnAccount() throws Exception {
        OnStage.theActorCalled("user").attemptsTo(OpenUp.thePage());

    }


    @When("^he fills the form with the data$")
    public void heFillsTheFormWithTheData(List<UserData> userDataList) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(UtestCreateSection.fillform(userDataList.get(0).getFirstName(),userDataList.get(0).getLastName(),userDataList.get(0).getEmail(),
                userDataList.get(0).getMonthBirth(), userDataList.get(0).getDayBirth(), userDataList.get(0).getYearBirth(), userDataList.get(0).getCity(), userDataList.get(0).getZip(),
                userDataList.get(0).getCountry(), userDataList.get(0).getComputer(), userDataList.get(0).getOsVersion(), userDataList.get(0).getOsLanguage(), userDataList.get(0).getPassword()));

    }



    @Then("^he can create an account and (.*)$")
    public void heCanCreateAnAccountAndCompleteSetup(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}