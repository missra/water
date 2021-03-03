import base.BaseTest;
import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scenario.login.LoginImplementation;

public class LoginTest extends BaseTest {

    LoginImplementation login;

    public LoginTest() throws InterruptedException {
        super();
        BaseTest.init();
        login = new LoginImplementation();
    }

    @BeforeMethod
    public void setUp() throws Exception {}

    @Test(priority = 1)
    public void EnterFakeEmailNoPassowrd() throws InterruptedException {
        login.EnterFakeEmailNoPassowrd();
        Assert.assertTrue(login.genwinLoginScenario.errorMsgIsDisplayed());
    }

    @Test(priority = 2)
    public void EnterRealEmailNoPassword() throws InterruptedException {
        login.EnterRealEmailNoPassword();
        Assert.assertFalse(login.genwinLoginScenario.errorMsgIsDisplayed());
    }

    @Test(priority = 3)
    public void EnterFakePasswordNoEmail() throws InterruptedException {
        login.EnterFakePasswordNoEmail();
        Assert.assertTrue(login.genwinLoginScenario.errorMsgIsDisplayed());
    }

    @Test(priority = 4)
    public void EnterFakeEmailAndPassword() throws InterruptedException {
        login.EnterFakeEmailAndPassword();
        Assert.assertTrue(login.genwinLoginScenario.errorMsgIsDisplayed());
    }

    @Test(priority = 5)
    public void EnterFakeEmailRealPassword() throws InterruptedException {
        login.EnterFakeEmailRealPassword();
        Assert.assertTrue(login.genwinLoginScenario.errorMsgIsDisplayed());
    }

    @Test(priority = 6)
    public void EnterRealEmailFakePassword() throws InterruptedException {
        login.EnterRealEmailFakePassword();
        waitTillLoad();
        Assert.assertTrue(login.genwinLoginScenario.errorDialogIsDisplayed());
    }

    @Test(priority = 7)
    public void HappyScenario() throws InterruptedException {
        login.HappyScenario();
        for(int i=0;i<6;i++)
        waitTillLoad();
        Assert.assertEquals(driver.getCurrentUrl(), "https://dev.her2owater.org/manage-campaigns/");
    }

    @After
    public void tearDown() {
        BaseTest.driver.quit();
    }
}