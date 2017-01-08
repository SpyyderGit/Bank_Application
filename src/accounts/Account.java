package accounts;

/**
 * Created by Jerald_PC on 08.01.2017.
 */
public abstract class Account {
    private double balance;

    public Account(double balance) {
        if (balance < 0) {
            System.out.println("Баланс отрицательный");
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Баланс отрицательный");
        } else {
            this.balance = balance;
        }
    }

    public abstract void getMoney(double sum);

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance + " Type: " + getClass().getSimpleName();
    }
}
