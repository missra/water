package scenario.mailCheck;

import base.BaseTest;
import base.PaymentFourm;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class water4HerDonate extends BaseTest {

    JavascriptExecutor js;

    public water4HerDonate() throws InterruptedException {
        js = (JavascriptExecutor) driver;
    }

    public void donate() throws InterruptedException {
        driver.get("https://dev.her2owater.org/");
        driver.switchTo().defaultContent();
        clickOnCss("form:nth-child(2) > input");
        clickOnCss(".btn:nth-child(1)");
        driver.switchTo().frame(1);
        enterAction("__BVID__48",user.getFullName());
        enterAction("__BVID__52",user.getEmail());
        enterAction("__BVID__56","01003754330");
        driver.switchTo().frame(0);
        enterTab();
        PaymentFourm.FillPaymentField();
        waitTillLoad();
        driver.switchTo().parentFrame();
        enterForActive("portsaid");
        element = driver.findElement(By.id("__BVID__84"));
        element.findElement(By.xpath("//option[. = 'Alabama']")).click();
        enterAction("__BVID__72","portd");
        enterAction("__BVID__75","421211");
        clickOnCss(".text-center > .btn");
        checkMail();
    }

}