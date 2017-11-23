package support;

import nicebank.Account;
import nicebank.CashSlot;
import nicebank.AutomatedTeller;
import nicebank.Teller;

/**
 * Created by juan.hernandez on 11/20/17.
 */
public class KnowsTheDomain {

    private Account myAccount;
    private CashSlot cashSlot;
    private Teller automatedTeller;


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
        if (null == automatedTeller) {
            automatedTeller = new AutomatedTeller(getCashSlot());
        }
        return automatedTeller;
    }
}
