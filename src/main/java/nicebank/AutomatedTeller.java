package nicebank;

/**
 * Created by juan.hernandez on 11/20/17.
 */
public class AutomatedTeller implements Teller{

    private CashSlot cashSlot;

    public AutomatedTeller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void witdrawFrom(Account account, Money amount) {
        account.debit(amount);
        cashSlot.dispense(amount);
    }
}
