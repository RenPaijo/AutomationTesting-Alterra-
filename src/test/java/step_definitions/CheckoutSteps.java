package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.web.pageObject.CheckoutPage;

public class CheckoutSteps {
    private WebDriver webDriver;

    public CheckoutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already in checkout page")
    public void ckPage(){
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.vrfyCkPage());
    }

    @When("User verify total price")
    public void totalPrice() throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        WebElement x = webDriver.findElement(By.xpath("//div[@class='summary_total_label']"));
        String total = x.getText();
        float priceTotal = Float.parseFloat(total.replaceAll("[^\\d.]+", ""));
        Assert.assertEquals(priceTotal, (double) checkoutPage.priceTotal(), 0);
        Thread.sleep(1000);
        checkoutPage.buttonFinish();
    }
}
