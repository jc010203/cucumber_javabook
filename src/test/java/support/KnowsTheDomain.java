package support;

import nicebank.Account;
import nicebank.CashSlot;
import nicebank.Teller;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by juan.hernandez on 11/20/17.
 */
public class KnowsTheDomain {

    private Account myAccount;
    private CashSlot cashSlot;
    private Teller teller;
    private EventFiringWebDriver webDriver;


    public Account getMyAccount() {
        if (null == myAccount) {
            myAccount = new Account();
        }
        return myAccount;
    }

    public CashSlot getCashSlot() {
        if (null == cashSlot) {
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }

    public Teller getAutomatedTeller() {
        if (null == teller) {
            teller = new AtmUserInterface();
        }
        return teller;
    }

    public EventFiringWebDriver getWebDriver(){
        if(webDriver == null){
            webDriver = new EventFiringWebDriver(new FirefoxDriver());
        }

        return webDriver;
    }
}
