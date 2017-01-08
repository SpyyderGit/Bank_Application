import java.util.ArrayList;

/**
 * Created by Jerald_PC on 08.01.2017.
 */
public class Bank {

    private ArrayList<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public ArrayList<Client> getAllClients() {
        return clients;
    }

    public void getClientInfo(String client) {
        for (Client c : clients) {
            if (clients.contains(c)) {
                System.out.println(c);
            }else {
                System.out.println("Такой клиент отсутствует в базе!");
            }
        }
    }
}
