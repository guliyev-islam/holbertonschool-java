import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, Double initialTransactionAmount) {
        setName(name);
        setTransactions(new ArrayList<Double>());
        getTransactions().add(initialTransactionAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Double transaction) {
        getTransactions().add(transaction);
    }
}