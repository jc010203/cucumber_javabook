package nicebank;

/**
 * Created by juan.hernandez on 11/20/17.
 */
public class Account {

    private Money balance = new Money(0, 0);

    public void deposit(Money amount) {
        balance = balance.add(amount);
    }

    public Money getBalance() {
        return balance;
    }
}
