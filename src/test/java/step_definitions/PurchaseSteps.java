package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.web.pageObject.LandingPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on landing page")
    public void vrfLandingPage(){
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.verifyLandingPage());
    }

    @And("User sort product list by {string}")
    public void sortProduct(String sort){
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.sortProduct(sort);
    }

    @And("User select 2 items")
    public void selectItem() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.basket_1();
        landingPage.basket_2();
        Thread.sleep(1000);
    }

    @Then("User click cart icon")
    public void cart(){
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickCart();
    }

    @And("User select 1 item {string}")
    public void items1(String stuff){
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+stuff+"']/ancestor" +
                "::div[@class='inventory_item_label']/following-sibling::div/button"));
        a.click();
    }

    @And("User select 2 items {string} and {string}")
    public void items2(String stuff){
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+stuff+"']/ancestor" +
                "::div[@class='inventory_item_label']/following-sibling::div/button"));
        a.click();
    }

    @And("User select 3 items {string}, {string}, and {string}")
    public void items3(String stuff){
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+stuff+"']/ancestor" +
                "::div[@class='inventory_item_label']/following-sibling::div/button"));
        a.click();
    }

    @And("User select 4 items {string}, {string}, {string}, {string}")
    public void items4(String stuff){
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+stuff+"']/ancestor" +
                "::div[@class='inventory_item_label']/following-sibling::div/button"));
        a.click();
    }

    @And("User select 5 items {string}, {string}, {string}, {string}, and {string}")
    public void items5(String stuff){
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+stuff+"']/ancestor" +
                "::div[@class='inventory_item_label']/following-sibling::div/button"));
        a.click();
    }

    @And("User select 6 items {string}, {string}, {string}, {string}, {string}, and {string}")
    public void items6(String stuff){
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+stuff+"']/ancestor" +
                "::div[@class='inventory_item_label']/following-sibling::div/button"));
        a.click();
    }
}
