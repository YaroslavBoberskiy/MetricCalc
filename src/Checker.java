import java.util.ArrayList;

public class Checker {

    private static Branch osokorki = new Branch("Osokorki");
    private static Branch pozniaki = new Branch("Pozniaki");
    private static Branch kharkivska = new Branch("Kharkivska");

    private static Customer osokorkovskiy = new Customer("Osokorkovskiy", 15.5);
    private static Customer pozniakovskiy = new Customer("Pozniakovskiy", 25.5);
    private static Customer kharkivskiy = new Customer("Kharkivskiy", 35.5);

    private static Bank bank = new Bank();

    public static void main(String[] args) {
        bank.AddBranch(osokorki);
        bank.AddBranch(pozniaki);
        bank.AddBranch(kharkivska);

        bank.ShowAllBranches();

        showAllCustomers(osokorki);
        showAllCustomers(pozniaki);
        showAllCustomers(kharkivska);

        osokorki.AddNewCustomer(osokorkovskiy);

        showAllCustomers(osokorki);

        osokorki.MakeTransaction(osokorkovskiy, 14.2);
        osokorki.MakeTransaction(osokorkovskiy, 14.7);

        showCustomerTransactions(osokorki, osokorkovskiy);

    }

    public static void showAllCustomers(Branch branch) {
        ArrayList<Customer> customers = branch.getCustomers();
        if (customers.size() == 0) {
            System.out.println("There is no customers in branch " + branch.getBranchName());
        } else {
            System.out.println("=== Customers of the branch " + branch.getBranchName() + "===");
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                System.out.println(branch.getCustomers().get(i).getName());
            }
        }
    }

    public static void showCustomerTransactions(Branch branch, Customer customer) {
        System.out.println("=== Transactions of the customer " + customer.getName() + "===");

        if (branch.getCustomers().contains(customer)) {
            customer = branch.getCustomers().get(branch.getCustomers().indexOf(customer));
            ArrayList<Double> transactions = customer.getTransactions();
            for (int i = 0; i < transactions.size(); i ++) {
                System.out.println(transactions.get(i));
            }
        } else {
            System.out.println("No such customer in the branch: " + branch.getBranchName());
        }
    }

}
