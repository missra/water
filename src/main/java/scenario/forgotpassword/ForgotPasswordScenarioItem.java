package scenario.forgotpassword;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordScenarioItem extends BaseTest {

    @FindBy(how= How.ID,using = "email")
    public WebElement email;

    @FindBy(how= How.CSS,using = "span:nth-child(1)")
    public WebElement sendRequest;

    @FindBy(how = How.LINK_TEXT,using = "Forgot Password?")
    WebElement forgotPasswordBtn;

    @FindBy(how = How.ID,using = "input-username-feedback")
    WebElement errorMsg;

    @FindBy(how = How.ID,using = "__BVID__43__toast_outer")
    WebElement errorDialog;

    @FindBy(how = How.CSS,using = "#__layout > div > div > div.row > div.col-12.col-md-6.login-container > div > div > div > span")
    WebElement SuccessValidation;

    public ForgotPasswordScenarioItem() throws InterruptedException {
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String emailTxt)throws InterruptedException{
        email.sendKeys(emailTxt);
        waitTillLoad();
    }

    public void clickSendRequest() throws InterruptedException {
        sendRequest.click();
        waitTillLoad();
    }

    public void clickForgotPassword() throws InterruptedException {
        forgotPasswordBtn.click();
        waitTillLoad();
    }

    public boolean errorMsgIsDisplayed(){
        return errorMsg.isDisplayed();
    }

    public boolean errorDialogIsDisplayed(){
        return errorDialog.isDisplayed();
    }

    public boolean successText(){
        return SuccessValidation.isDisplayed();
    }
}
