package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import test.web.pageObject.CartPage;

public class CartSteps {
    private WebDriver webDriver;

    public CartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User already on cart page")
    public void verifyCartPage() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.vrfyCartPage());
    }

    @When("User click remove button on T-Shirt (Red) in cart page")
    public void backpackCart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.item();
    }

    @Then("T-Shirt (Red) in cart should no longer be there")
    public void vrfyBackpackCart(){
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertFalse(cartPage.backpackVerify());
    }

    @And("User want to continue to checkout information page")
    public void checkOut(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.checkOutPage();
    }
}
