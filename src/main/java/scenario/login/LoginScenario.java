package scenario.login;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginScenario extends BaseTest {

    @FindBy(how = How.ID, using = "__BVID__19")
    WebElement emailField;

    @FindBy(how = How.ID, using = "__BVID__21")
    WebElement passwordField;

    @FindBy(how = How.CSS,using = ".btn > span")
    WebElement loginBtn;

    @FindBy(how = How.ID,using="input-username-feedback")
    WebElement errorMsg;

    @FindBy(how = How.CSS,using=".toast-header")
    WebElement errorDialog;

    public LoginScenario() throws InterruptedException {
        PageFactory.initElements(driver, this);
        waitTillLoad();
    }

    public void enterEmail(String email) throws InterruptedException {
        emailField.sendKeys(email);
        waitTillLoad();
    }

    public void enterPassword(String password) throws InterruptedException {
        passwordField.sendKeys(password);
        waitTillLoad();
    }

    public void clickLogin() throws InterruptedException {
        loginBtn.click();
        waitTillLoad();
    }

    public boolean errorDialogIsDisplayed() throws InterruptedException {
        return errorDialog.isDisplayed();
    }

    public boolean errorMsgIsDisplayed(){
        return errorMsg.isDisplayed();
    }


}