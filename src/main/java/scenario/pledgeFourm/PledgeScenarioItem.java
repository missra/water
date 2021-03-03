package scenario.pledgeFourm;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PledgeScenarioItem extends BaseTest {


    @FindBy(how = How.NAME, using = "first-name")
    public WebElement firstNameField;

    @FindBy(how = How.NAME, using = "last-name")
    public WebElement lastNameField;

    @FindBy(how = How.NAME, using = "your-email")
    public WebElement emailField;

    @FindBy(how = How.XPATH, using = "//option[. = 'Alabama']")
    public WebElement stateAlabama;

    @FindBy(how = How.CSS, using = "#take-the-pledge .close-popup")
    public WebElement closePopup;

    @FindBy(how = How.CSS, using = ".wpcf7-submit")
    public WebElement takePledge;

    public PledgeScenarioItem() throws InterruptedException {
        driver.get("https://dev.her2owater.org/");
        PageFactory.initElements(driver, this);
        fillTourForm();
    }

    public void fillTourForm() throws InterruptedException {
        clickByLinkTxt("Take the Pledge to start");
        loadHappyScenario();
    }

    private void loadHappyScenario() throws InterruptedException {
        enterFirstName(user.getFirstName());
        enterLastName(user.getLastName());
        enterEmail(user.getEmail());
        clickChooseState();
        clickTakePledge();
        waitTillLoad();
//        checkMail();
        clickByLinkTxt("Join");
        clickByLinkTxt("Start a Team Now");
    }

    private void enterFirstName(String name) throws InterruptedException {
        firstNameField.sendKeys(name);
        waitTillLoad();
    }

    private void enterLastName(String name) throws InterruptedException {
        lastNameField.sendKeys(name);
        waitTillLoad();
    }

    private void enterEmail(String name) throws InterruptedException {
        emailField.sendKeys(name);
        waitTillLoad();
    }

    private void clickChooseState() throws InterruptedException {
        stateAlabama.click();
        waitTillLoad();
    }

    private void clickClosePopUp() throws InterruptedException {
        closePopup.click();
        waitTillLoad();
    }

    private void clickTakePledge() throws InterruptedException {
        takePledge.click();
        waitTillLoad();
    }

}
