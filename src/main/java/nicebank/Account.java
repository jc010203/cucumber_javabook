package nicebank;

/**
 * Created by juan.hernandez on 11/20/17.
 */
public class Account {

    private Money balance = new Money();

    public void credit(Money amount) {
        balance = balance.add(amount);
    }

    public void debit(Money amount) {
        balance = balance.minus(amount);
    }

    public Money getBalance() {
        return balance;
    }
}
