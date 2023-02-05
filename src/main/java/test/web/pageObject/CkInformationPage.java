package test.web.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CkInformationPage {
    public static WebDriver driver;

    public CkInformationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement ckInformationPage;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;

    public boolean vrfyCkInformationPage(){
        ckInformationPage.isDisplayed();
        return true;
    }

    public void setFirstName(String ftName){
        firstName.sendKeys(ftName);
    }

    public void setLastName(String lsName){
        lastName.sendKeys(lsName);
    }

    public void setZipCode(String code){
        postalCode.sendKeys(code);
    }

    public void button(){
        btnContinue.click();
    }






}
