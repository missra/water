package scenario.login;

import base.BaseTest;
import base.ScenarioItemFactory;

public class LoginImplementation {
    //implementing the loginScenario
    public LoginScenario genwinLoginScenario;

    public LoginImplementation() throws InterruptedException {
        BaseTest.driver.get("https://dev.her2owater.org/log-in/");
        genwinLoginScenario = ScenarioItemFactory.buildLoginItems();
        BaseTest.driver.switchTo().frame(0);
    }


    public void HappyScenario() throws InterruptedException {
        BaseTest.print("HappyScenario case 8");
        clearAllField();
        genwinLoginScenario.enterEmail(BaseTest.user.getLoggedInUserEmail());
        genwinLoginScenario.enterPassword(BaseTest.user.getLoggedInPassword());
        genwinLoginScenario.clickLogin();
    }

    public void EnterRealEmailFakePassword() throws InterruptedException {
        BaseTest.print("EnterRealEmailFakePassword case 7");
        clearAllField();
        genwinLoginScenario.enterEmail(BaseTest.user.getLoggedInUserEmail());
        genwinLoginScenario.enterPassword("121233");
        genwinLoginScenario.clickLogin();
    }

    public void EnterFakeEmailRealPassword() throws InterruptedException {
        BaseTest.print("EnterFakeEmailRealPassword case 6");
        clearAllField();
        genwinLoginScenario.enterEmail("misswm");
        genwinLoginScenario.enterPassword(BaseTest.user.getLoggedInPassword());
        genwinLoginScenario.clickLogin();
    }

    public void EnterFakeEmailAndPassword() throws InterruptedException {
        BaseTest.print("EnterFakeEmailAndPassword case 5");
        clearAllField();
        genwinLoginScenario.enterEmail("mmwmiw");
        genwinLoginScenario.enterPassword("12131");
        genwinLoginScenario.clickLogin();
    }

    public void EnterFakePasswordNoEmail() throws InterruptedException {
        BaseTest.print("EnterFakePasswordNoEmail case 4");
        clearAllField();
        genwinLoginScenario.enterPassword("12131");
        genwinLoginScenario.clickLogin();
    }

    public void EnterRealEmailNoPassword() throws InterruptedException {
        BaseTest.print("EnterRealEmailNoPassword case 3");
        clearAllField();
        genwinLoginScenario.enterEmail(BaseTest.user.getEmail());
        genwinLoginScenario.clickLogin();
    }

    public void EnterFakeEmailNoPassowrd() throws InterruptedException {
        BaseTest.print("EnterFakeEmailNoPassowrd case 2");
        genwinLoginScenario.enterEmail("missra");
        genwinLoginScenario.enterPassword("missra");
        genwinLoginScenario.clickLogin();
    }

    public void AllBlankScenario() throws InterruptedException {
        BaseTest.print("scenario one all is blank");
        genwinLoginScenario.clickLogin();
    }

    public void clearAllField() throws InterruptedException {
        genwinLoginScenario.clearFieldById(genwinLoginScenario.emailField);//empty email
        genwinLoginScenario.clearFieldById(genwinLoginScenario.passwordField);
    }
}
