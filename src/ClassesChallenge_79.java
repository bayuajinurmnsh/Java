public class ClassesChallenge_79 {
    /*
    Do:
    Create a new class for a bank account.
    Create fields for account characteristics like:
        - account number
        - account balance
        - customer name
        - email
        - phone number
    Create getters and setter for each field.
    Create two additional methods:
        - one for depositing funds into the account
        - one for withdrawing funds from the account

    Don't:
    - A customer should not be allowed to withdraw funds, if that withdrawal takes their balance negative.
    * */

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if(balance<0)
            this.balance=0.0;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        setBalance(depositAmount);
        System.out.println("Account Number: " + accountNumber + "\n Balance: " + balance);
        System.out.println("Deposit Done!");
    }

    public void withdraw(double withdrawAmount){
        double newBalance = this.balance - withdrawAmount;
        if(newBalance<0)
            System.out.println("Insufficient funds!");
        else{
            setBalance(newBalance);
            System.out.println("Account Number: " + accountNumber + "\n Balance: " + balance);
            System.out.println("Withdraw Done!");
        }

    }
}
