package nicebank;

/**
 * Created by juan.hernandez on 11/20/17.
 */
public class CashSlot {

    private int contents;

    public int getContents() {
        return contents;
    }

    public void dispense(int dollars) {
        contents = dollars;
    }
}
