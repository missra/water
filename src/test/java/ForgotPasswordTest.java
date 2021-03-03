import base.BaseTest;
import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scenario.forgotpassword.ForgotPasswordImplementation;

public class ForgotPasswordTest extends BaseTest{

    ForgotPasswordImplementation forgotPassword;

    public ForgotPasswordTest() throws InterruptedException {
        super();
        BaseTest.init();
        forgotPassword = new ForgotPasswordImplementation();
    }

    @BeforeMethod
    public void setUp() throws Exception {}

    @Test(priority = 1)
    public void enterWrongEmailFormat() throws InterruptedException {
        forgotPassword.enterWrongEmailFormat();
        Assert.assertTrue(forgotPassword.forgotPasswordScenarioItem.errorMsgIsDisplayed());
    }

    @Test(priority = 2)
    public void enterNotValidEmail() throws InterruptedException {
        forgotPassword.enterNotValidEmail();
        Assert.assertTrue(forgotPassword.forgotPasswordScenarioItem.errorDialogIsDisplayed());
    }

    @Test(priority = 3)
    public void enterValidEmail() throws InterruptedException {
        forgotPassword.enterValidEmail();
        waitTillLoad();
        Assert.assertTrue(forgotPassword.forgotPasswordScenarioItem.successText());
    }

    @After
    public void tearDown() {
        BaseTest.driver.quit();
    }

}
