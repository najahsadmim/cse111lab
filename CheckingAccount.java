
public class CheckingAccount extends Account {

    public static int count = 0;

    public CheckingAccount() {
        this(0.0);
    }

    public CheckingAccount(double balance) {
        super(balance);
        this.balance=balance;
        count++;
    }
}
