package support;

import nicebank.Account;
import nicebank.CashSlot;
import nicebank.Teller;

/**
 * Created by juan.hernandez on 11/20/17.
 */
public class KnowsTheDomain {

    private Account myAccount;
    private CashSlot cashSlot;
    private Teller teller;


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

    public Teller getTeller() {
        if (null == teller) {
            teller = new Teller(getCashSlot());
        }
        return teller;
    }
}
