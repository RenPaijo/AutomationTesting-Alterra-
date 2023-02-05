package test.web.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement cartPage;

    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement itemPurchase;

    @FindBy(xpath = "//div[@class='cart_list']/div[contains(.,'1Sauce Labs Backpackcarry.allTheThings()" +
            " with the sleek, streamlined Sly Pack th')]")
    private WebElement vrfyBackpack;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkOut;

    public boolean vrfyCartPage() throws InterruptedException {
        cartPage.isDisplayed();
        Thread.sleep(1000);
        return true;
    }

    public void item() throws InterruptedException {
        itemPurchase.click();
        Thread.sleep(1000);
    }

    public boolean backpackVerify(){
        vrfyBackpack.isDisplayed();
        return false;
    }

    public void checkOutPage(){
        checkOut.click();
    }
}
