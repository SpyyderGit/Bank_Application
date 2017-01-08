package accounts;

/**
 * Created by Jerald_PC on 08.01.2017.
 */
public class CheckingAccount extends Account {

    private double overdraft;

    public CheckingAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = overdraft;
    }

    @Override
    public void getMoney(double sum) {
        if (sum > overdraft) {
            System.out.println("Сумма > overdraft");
        } else {
            setBalance(getBalance() - sum);
        }
    }

    @Override
    public String toString() {
        return "balance=" + getBalance() + "\noverdraft=" + overdraft + "\nType: " + getClass().getSimpleName();
    }
}
