package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.web.pageObject.LandingPage;
import test.web.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUsername(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Given("User open the website sauce demo")
    public void verifyLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @Then("User see error {string} on landing page")
    public void verifyErrorText(String errorText){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginPage.verifyErrorText());
    }
}
