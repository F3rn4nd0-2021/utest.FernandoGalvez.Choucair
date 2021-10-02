package utest.fernandogalvez.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utest.fernandogalvez.model.uTestData;
import utest.fernandogalvez.questions.Answer;
import utest.fernandogalvez.tasks.Button;
import utest.fernandogalvez.tasks.Register;
import utest.fernandogalvez.tasks.OpenUP;

import java.util.List;


public class UTestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("that fernando wants to sign up to uTest")
    public void thatfernandoWantsToSignUpToUtest(){
        OnStage.theActorCalled("fernando").wasAbleTo(OpenUP.thePage());
    }

    @When("^he clicks hhe Join Today button$")
    public void heClicksHheJoinTodayButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(Button.joinToday());


    }



    @When("he introduces his personal data")

    public void heIntroducesHisPersonalData(List<uTestData>uTestData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo ( Register.thePage(



                uTestData.get(0).getStrFirstName(),
                uTestData.get(0).getStrLastName(),
                uTestData.get(0).getStrEmailAddress(),
                uTestData.get(0).getStrBirthMonth(),
                uTestData.get(0).getStrBirthDay(),
                uTestData.get(0).getStrBirthYear(),
                uTestData.get(0).getStrUserLanguage(),
                uTestData.get(0).getStrCity(),
                uTestData.get(0).getStrZipPostalCode(),
                uTestData.get(0).getStrCountry(),
                uTestData.get(0).getStrComputerOs(),
                uTestData.get(0).getStrOsVersion(),
                uTestData.get(0).getStrComputerLanguage(),
                uTestData.get(0).getStrMobileDevice(),
                uTestData.get(0).getStrModel(),
                uTestData.get(0).getStrMobileOs(),
                uTestData.get(0).getStrPassword()));

    }
    @Then("the register is complete")
    public void theRegistreIsComplete( List<uTestData>uTestData)throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrSuccessSignUpMessage())));
    }

}
