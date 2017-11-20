import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public void AddNewCustomer (Customer newCustomer) {
        this.customers.add(newCustomer);
    }

    public void MakeTransaction (Customer customer, Double transactionAmount) {
        customer.getTransactions().add(transactionAmount);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }
}
