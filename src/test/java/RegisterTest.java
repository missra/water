import base.BaseTest;
import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scenario.registefourm.RegisterFormImplementation;

public class RegisterTest extends BaseTest {
    
    RegisterFormImplementation register;
    
    public RegisterTest() throws InterruptedException { 
        super();
        BaseTest.init();
        register = new RegisterFormImplementation();
    }

    @BeforeMethod
    public void setUp() throws Exception {}

    @Test(priority = 1)
    public void fillPreLoggedIn() throws InterruptedException {
        register.fillPreLoggedIn();
        Assert.assertTrue(register.registerFormScenarioItem.emailErrorMsgDisplayed());
    }

    @Test(priority = 2)
    public void fillFalseEmail() throws InterruptedException {
        register.fillFalseEmail();
        Assert.assertTrue(register.registerFormScenarioItem.emailErrorMsgDisplayed());
    }

    @Test(priority = 3)
    public void fillFalsePassword() throws InterruptedException {
        register.fillFalsePassword();
        waitTillLoad();
        Assert.assertTrue(register.registerFormScenarioItem.errorMsgDisplayed());
    }

    @Test(priority = 4)
    public void fillHappyScenario() throws InterruptedException {
        register.fillHappyScenario();
        Assert.assertTrue(register.registerFormScenarioItem.thanksLabelDisplayed());
    }

    @After
    public void tearDown() {
        BaseTest.driver.quit();
    }

}
