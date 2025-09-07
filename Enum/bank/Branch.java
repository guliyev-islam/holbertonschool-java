import java.util.ArrayList;

public class Branch {

        private String name;
        private ArrayList<Customer> customers;

        public Branch(String name) {
            setName(name);
            setCustomers(new ArrayList<Customer>());
        }
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Customer> getCustomers() {
            return customers;
        }

        public void setCustomers(ArrayList<Customer> customers) {
            this.customers = customers;
        }

        public Customer findCustomer(String name) {
            for (Customer customer: getCustomers()) {
                if (customer.getName().equals(name)) {
                    return customer;
                }
            }

            return null;
        }

        public boolean newCustomer(String name, Double initialTransactionAmount) {
            Customer foundCustomer = findCustomer(name);
            if (foundCustomer != null) {
                return false;
            }

            Customer customerToAdd = new Customer(name, initialTransactionAmount);
            getCustomers().add(customerToAdd);
            return true;
        }

        public boolean addCustomerTransaction(String name, Double transactionAmount) {
            Customer customer = findCustomer(name);
            if (customer == null) {
               return false;
            }

            customer.addTransaction(transactionAmount);
            return true;
        }
}