package accounts;

/**
 * Created by Jerald_PC on 08.01.2017.
 */
public class SavingAccount extends Account {

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public void getMoney(double sum) {
        if (sum > getBalance()) {
            System.out.println("Снимаемая сумма привышает баланс");
        } else {
            setBalance(getBalance() - sum);
        }
    }
}
