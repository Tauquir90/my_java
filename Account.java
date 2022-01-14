public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double depositFund(double deposit) {
        balance += deposit;
        System.out.println("U successfully deposited "+deposit+"rs");
        return balance;
    }

    public double withdrawFund(double withdraw) {
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println("u successfully withdrawn " + withdraw + " rs");
            return balance;
        } else {
            System.out.println("Sorry u have insufficient funds!!!");
            return balance;
        }
    }
}
