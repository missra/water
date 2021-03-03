package base;

import constants.UserData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class BaseTest {

    public static WebDriver driver;
    public WebElement element;
    public static Actions builder;
    public static UserData user;
    public static JavascriptExecutor js;
    static String chromeProperty = "webdriver.chrome.driver";
    static String chromePath = "/Users/macbookpro2017/Downloads/chromedriver";

    public BaseTest() throws InterruptedException {}
    public static void init(){
        user = new UserData();
        System.setProperty(chromeProperty, chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        builder = new Actions(driver);
        js = (JavascriptExecutor) driver;
    }

    public void clickByLinkTxt(String link) throws InterruptedException {
        driver.findElement(By.linkText(link)).click();
        waitTillLoad();
    }

    public void clickOnCss(String css) throws InterruptedException {
        driver.findElement(By.cssSelector(css)).click();
        waitTillLoad();
    }

    public void forceClick(WebElement element) throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
        waitTillLoad();
    }

    public void enterAction(String id, String key) throws InterruptedException {
        driver.findElement(By.id(id)).sendKeys(key);
        waitTillLoad();
    }

    public static void enterTab() throws InterruptedException {
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        waitTillLoad();
    }

    public static void enterForActive(String key) throws InterruptedException {
        driver.switchTo().activeElement().sendKeys(key);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        waitTillLoad();
    }

    public void clearFieldById(WebElement elm) throws InterruptedException {
        elm.clear();
        waitTillLoad();
    }

    public static void waitTillLoad() throws InterruptedException {
        Thread.sleep(1500);
    }

    public static void print(String s) {
        System.out.println("-------------" + s + "----------------");
    }

    public void checkMail() throws InterruptedException {
        js.executeScript("window.open('https://www.mailinator.com/v4/public/inboxes.jsp?to=" + user.getEmailId() + "', '_blank');");
        Thread.sleep(15000);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        try {
            driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr")).click();
            waitTillLoad();
            driver.switchTo().frame(0);
            waitTillLoad();

            driver.findElement(By.xpath("//a[contains(text(),'please click on the following link to set your password')]")).click();
            waitTillLoad();
        } catch (Exception ignored) {
        }
        driver.switchTo().window(tabs2.get(0));
        waitTillLoad();
    }

    public void checkMail(String emailId) throws InterruptedException {
        js.executeScript("window.open('https://www.mailinator.com/v4/public/inboxes.jsp?to=" + emailId + "', '_blank');");
        Thread.sleep(15000);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.switchTo().defaultContent();
        waitTillLoad();
    }

    public void clearExactField(WebElement elem) throws InterruptedException {
        elem.clear();
        waitTillLoad();
    }
}
