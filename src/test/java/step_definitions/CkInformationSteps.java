package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import test.web.pageObject.CkInformationPage;

public class CkInformationSteps {
    private WebDriver webDriver;

    public CkInformationSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already in checkout information page")
    public void ckInformation(){
        CkInformationPage ckInformationPage = new CkInformationPage(webDriver);
        Assert.assertTrue(ckInformationPage.vrfyCkInformationPage());
    }

    @When("User input {string} as firstname, {string} as lastname, and {string} as Zip code")
    public void InputCredentials(String firstName, String lastName, String zip) throws InterruptedException {
        CkInformationPage ckInformationPage = new CkInformationPage(webDriver);
        ckInformationPage.setFirstName(firstName);
        ckInformationPage.setLastName(lastName);
        ckInformationPage.setZipCode(zip);
        Thread.sleep(1000);
        ckInformationPage.button();
    }
}
