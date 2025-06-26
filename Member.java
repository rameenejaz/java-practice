import java.util.ArrayList;

public abstract class Member {
    protected String name, address;
    protected ArrayList<Transaction> transactions = new ArrayList<>();

    public Member(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract int getFinePerDay();

    public String getName() { return name; }
    public String getAddress() { return address; }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void showHistory() {
        System.out.println("Borrowing history for " + name + ":");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
