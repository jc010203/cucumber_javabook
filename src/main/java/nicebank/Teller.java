package nicebank;

/**
 * Created by juan.hernandez on 11/20/17.
 */
public class Teller {

    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, Money amount) {
        account.debit(amount);
        cashSlot.dispense(amount);
    }
}
