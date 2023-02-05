package test.web.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public static WebDriver driver;

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement checkout;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemTotal;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;

    public  boolean vrfyCkPage(){
        checkout.isDisplayed();
        return true;
    }

    public float priceTotal(){
        String iValue = itemTotal.getText();
        String taValue = tax.getText();
        float i = Float.parseFloat(iValue.replaceAll("[^\\d.]+", ""));
        float ta = Float.parseFloat(taValue.replaceAll("[^\\d.]+", ""));

        float resultPrice = i + ta;
        return resultPrice;
    }

    public void buttonFinish(){
        btnFinish.click();
    }
}
