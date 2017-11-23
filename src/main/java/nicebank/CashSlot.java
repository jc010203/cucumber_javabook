package nicebank;

/**
 * Created by juan.hernandez on 11/20/17.
 */
public class CashSlot {

    private Money contents;

    public Money getContents() {
        return contents;
    }

    public void dispense(Money dollars) {
        contents = dollars;
    }
}
