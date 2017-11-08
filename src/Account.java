public class Account {

    private int accountID;
    private String customerName;
    private double accountBalance;
    private String eMail;
    private String telNumber;

    // Setters

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setCoustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    // Getters

    public int getAccountID() {
        return accountID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String geteMail() {
        return eMail;
    }

    public String getTelNumber() {
        return telNumber;
    }

    // Methods

    public void depositTransaction(double depositAmount) {
        if (depositAmount > 0) {
            double currentAccounBalance = getAccountBalance();
            currentAccounBalance += depositAmount;
            setAccountBalance(currentAccounBalance);
        } else {
            System.out.print("DepositTransaction error");
        }
    }

    public void withdrawalTransaction(double withdrawalAmount) {
        if (withdrawalAmount > 0) {
            double currentAccounBalance = getAccountBalance();
            currentAccounBalance -= withdrawalAmount;
            setAccountBalance(currentAccounBalance);
        } else {
            System.out.print("WithdrawalTransaction error");
        }
    }
}
