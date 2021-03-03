package scenario.forgotpassword;

import base.BaseTest;
import base.ScenarioItemFactory;
import constants.UserData;

public class ForgotPasswordImplementation {

    public ForgotPasswordScenarioItem forgotPasswordScenarioItem;
    UserData user;

    public ForgotPasswordImplementation() throws InterruptedException {
        BaseTest.driver.get("https://dev.her2owater.org/log-in/");
        BaseTest.driver.switchTo().frame(0);
        forgotPasswordScenarioItem = ScenarioItemFactory.buildForgotPass();
        forgotPasswordScenarioItem.clickForgotPassword();
        user = BaseTest.user;
    }

    public void enterWrongEmailFormat() throws InterruptedException {
        BaseTest.print("forgot Password entering wrong email");
        forgotPasswordScenarioItem.enterEmail(user.getWrongEmail());
        forgotPasswordScenarioItem.clickSendRequest();
        forgotPasswordScenarioItem.clearExactField(forgotPasswordScenarioItem.email);
    }

    public void enterNotValidEmail() throws InterruptedException {
        BaseTest.print("forgot Password entering wrong email");
        forgotPasswordScenarioItem.enterEmail(user.getEmail());
        forgotPasswordScenarioItem.clickSendRequest();
        forgotPasswordScenarioItem.clearExactField(forgotPasswordScenarioItem.email);
    }

    public void enterValidEmail() throws InterruptedException{
        BaseTest.print("valid email");
        forgotPasswordScenarioItem.enterEmail(user.getForgotPassEmail());
        forgotPasswordScenarioItem.clickSendRequest();
        BaseTest.driver.navigate().back();

    }

}