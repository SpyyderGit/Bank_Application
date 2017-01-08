import accounts.Account;

import java.util.ArrayList;

/**
 * Created by Jerald_PC on 08.01.2017.
 */
public class Client {
    private String name;
    private String activeAcc;
    private Gender gender;

    private ArrayList<String> listOfAcc = new ArrayList<>();

    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void addAcc(String acc) {
        if (listOfAcc.isEmpty()) {
            activeAcc = acc;
        }
        listOfAcc.add(acc);
    }

    public void setActiveAcc(String activeAcc) {
        for (String a : listOfAcc) {
            if (a.contains(activeAcc)) {
                this.activeAcc = activeAcc;
            } else {
                System.out.println("такого счета нету!!!");
            }
        }
    }

    public double getTotalBalance() {
        double ret = 0;
        return ret;
    }

    @Override
    public String toString() {
        return "Client{" +
                "\nname='" + name + '\'' +
                "\nactiveAcc='" + activeAcc + '\'' +
                "\ngender=" + gender +
                "\nlistOfAcc=" + listOfAcc + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        return gender == client.gender;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}
