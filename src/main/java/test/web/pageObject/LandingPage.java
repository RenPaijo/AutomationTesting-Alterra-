package test.web.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {
    public static WebDriver driver;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement landingPage;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basket1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basket2;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cart;

    public boolean verifyLandingPage(){
        landingPage.isDisplayed();
        return true;
    }

    public void sortProduct(String sort){
        Select x = new Select(selectContainer);
        x.selectByVisibleText(sort);
    }

    public void basket_1(){
        basket1.click();
    }

    public void basket_2(){
        basket2.click();
    }

    public void clickCart(){
        cart.click();
    }
}
