package scenario.registefourm;

import base.BaseTest;
import base.ScenarioItemFactory;

public class RegisterFormImplementation {

   public  RegisterFormScenarioItem registerFormScenarioItem;

    public RegisterFormImplementation()throws InterruptedException{
        BaseTest.driver.get("https://dev.her2owater.org/register/");
        registerFormScenarioItem = ScenarioItemFactory.buildRegisterItem();
    }

    public void fillPreLoggedIn()throws InterruptedException{
        BaseTest.print("check sign up with invalid data -- Pre - LoggedIn");
        registerFormScenarioItem.enterFullName(BaseTest.user.getFullName());
        registerFormScenarioItem.enterEmail(BaseTest.user.getLoggedInUserEmail());
        registerFormScenarioItem.enterPassword(BaseTest.user.getLoggedInPassword());
        registerFormScenarioItem.enterConfirmPassword(BaseTest.user.getLoggedInPassword());
        registerFormScenarioItem.clickOnTermsAndCondition();
        registerFormScenarioItem.clickOnRegisterBtn();
        registerFormScenarioItem.clearExactField(registerFormScenarioItem.emailField);
    }

    public void fillFalseEmail()throws InterruptedException{
        BaseTest.print("check sign up with invalid data -- wrong formats");
        registerFormScenarioItem.enterEmail(BaseTest.user.getWrongEmail());
        registerFormScenarioItem.clickOnRegisterBtn();
        registerFormScenarioItem.clearExactField(registerFormScenarioItem.emailField);
        registerFormScenarioItem.clearExactField(registerFormScenarioItem.passwordField);
        registerFormScenarioItem.clearExactField(registerFormScenarioItem.confirmPassword);
    }

    public void fillFalsePassword()throws InterruptedException{
        BaseTest.print("check sign up with invalid data -- false password formats");
        registerFormScenarioItem.enterEmail(BaseTest.user.getEmail());
        registerFormScenarioItem.enterPassword("   ");
        registerFormScenarioItem.enterConfirmPassword(BaseTest.user.getPassword());
        registerFormScenarioItem.clickOnRegisterBtn();
        registerFormScenarioItem.clearExactField(registerFormScenarioItem.passwordField);
    }

    public void fillHappyScenario()throws InterruptedException{
        BaseTest.print("check normal sign up with valid data");
        registerFormScenarioItem.enterPassword(BaseTest.user.getPassword());
        registerFormScenarioItem.clickOnRegisterBtn();
        registerFormScenarioItem.checkMail();
    }
}
