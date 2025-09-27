public class Account {
    private String number;
    private double balance;
    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private String customerEmail;
    private String customerPhone;

    public void despositFunds(double despositFunds) {
        balance += despositFunds;
        System.err.println("Deposit of $" + despositFunds + " made. New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawFunds) {
        if (balance - withdrawFunds < 0) {
            System.err.println("Insufficient Funds! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawFunds;
            System.err.println("Withdrawal of $" + withdrawFunds + " processed. Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

}
