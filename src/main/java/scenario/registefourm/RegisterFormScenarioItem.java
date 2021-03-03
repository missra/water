package scenario.registefourm;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterFormScenarioItem extends BaseTest {

    @FindBy(how = How.ID,using = "__BVID__19")
    public WebElement fullNameField;

    @FindBy(how = How.ID,using = "__BVID__21")
    public WebElement emailField;

    @FindBy(how = How.ID,using = "__BVID__23")
    public WebElement passwordField;

    @FindBy(how = How.ID,using = "__BVID__25")
    public WebElement confirmPassword;

    @FindBy(how = How.CSS,using = "span:nth-child(1)")
    public WebElement registerBtn;

    @FindBy(how = How.LINK_TEXT,using = "Sign In")
    private WebElement loginBtn;

    @FindBy(how = How.ID,using = "input-email-feedback")
    private WebElement emailErrorMsg;

    @FindBy(how = How.ID,using = "input-email-feedback")
    private WebElement passwordErrorMsg;

    @FindBy(how = How.ID,using = "__BVID__36")
    private WebElement errorMsg;

    @FindBy(how = How.CSS,using = "#__layout > div > div > div.row > div.col-12.col-md-6.login-container > div > div > div > h2")
    private WebElement thanksLabel;

    public RegisterFormScenarioItem() throws InterruptedException {
        driver.switchTo().frame(0);
        PageFactory.initElements(driver, this);
        waitTillLoad();
    }

    public void enterFullName(String firstname) throws InterruptedException{
        fullNameField.sendKeys(firstname);
        waitTillLoad();
    }

    public void enterEmail(String email)throws InterruptedException{
        emailField.sendKeys(email);
        waitTillLoad();
    }

    public void enterPassword(String password)throws InterruptedException{
        passwordField.sendKeys(password);
        waitTillLoad();
    }

    public void clickOnTermsAndCondition()throws InterruptedException{
        BaseTest.enterTab();
        forceClick(BaseTest.driver.switchTo().activeElement());
    }

    public void clickOnRegisterBtn()throws InterruptedException{
        registerBtn.click();
        waitTillLoad();
    }

    public void enterConfirmPassword(String confirmPasswordTxt) throws InterruptedException {
        confirmPassword.sendKeys(confirmPasswordTxt);
        waitTillLoad();
    }

    public void clickLoginBtn() throws InterruptedException {
        loginBtn.click();
        waitTillLoad();
    }

    public boolean emailErrorMsgDisplayed(){
        return emailErrorMsg.isDisplayed();
    }

    public boolean passErrorDisplayed(){
        return passwordErrorMsg.isDisplayed();
    }

    public boolean errorMsgDisplayed(){
        return errorMsg.isDisplayed();
    }

    public boolean thanksLabelDisplayed(){
        return thanksLabel.isDisplayed();
    }

}
