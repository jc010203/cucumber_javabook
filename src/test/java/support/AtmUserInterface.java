package support;

import nicebank.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by juan.hernandez on 11/22/17.
 */
public class AtmUserInterface implements Teller {

    private EventFiringWebDriver webDriver;

    public AtmUserInterface() {
        System.setProperty("webdriver.gecko.driver", "/Users/juan.hernandez/CukeBook/atm-example/src/test/resources/geckodriver");
        this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
    }

    public void witdrawFromTeller(Account account, Money dollars) {
        try {
            webDriver.get("http://localhost:" + ServerHooks.PORT);
            webDriver.findElement(By.id("Amount"))
                    .sendKeys(String.valueOf(dollars.dollars()));
            webDriver.findElement(By.id("Withdraw")).click();
        } finally {
            webDriver.close();
        }
    }
}
