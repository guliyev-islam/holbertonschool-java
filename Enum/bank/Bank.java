import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        setName(name);
        setBranches(new ArrayList<Branch>());
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public Branch findBranch(String name) {
        for (Branch branch: getBranches()) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }

        return null;
    }

    public boolean addBranch(String name) {
        Branch foundBranch = findBranch(name);
        if (foundBranch != null) {
            return false;
        }

        Branch newBranch = new Branch(name);
        getBranches().add(newBranch);
        return true;
    }


    public boolean addCustomer(String branchName, String customerName, Double initialTransactionAmount) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        boolean added = branch.newCustomer(customerName, initialTransactionAmount); 
        return added;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, Double transactionAmount) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        Customer customer = branch.findCustomer(customerName);
        if (customer == null) {
            return false;
        }

        customer.addTransaction(transactionAmount);
        return true;
    }


    public boolean listCustomers(String branchName, Boolean printsTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        int customerIndex = 1;
        int transactionIndex = 1;


        for (Customer customer: branch.getCustomers()) {
            System.out.printf("Client: %s [%d]\n", customer.getName(), customerIndex);
            if (printsTransactions) {
                for (Double transaction: customer.getTransactions()) {
                    System.out.printf("  [%d] value %.2f\n", transactionIndex, transaction);
                    transactionIndex++;
                }
                transactionIndex = 1;
            }
            customerIndex++;
        }
        
        return true;
    }
}