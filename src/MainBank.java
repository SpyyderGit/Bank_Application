import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingAccount;

/**
 * Created by Jerald_PC on 08.01.2017.
 */
public class MainBank {
    public static void main(String[] args) {

        Client vasya = new Client("Vasya", Gender.MALE);
        vasya.addAcc("262578932156333221");
        vasya.addAcc("262563332156333287");
        Account savingAccVasya = new SavingAccount(3621.12);
        Account checkAccVasya = new CheckingAccount(12,400);
        vasya.setActiveAcc("262563332156333287");



        Bank bank = new Bank();
        bank.addClient(vasya);
        System.out.println(bank.getAllClients());
        bank.getClientInfo("Vasya");

    }
}
