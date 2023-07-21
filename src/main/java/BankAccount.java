import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private Double balance;

    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


//    Getters and setters

    public void setFirstName(String inputFirstName) {
        this.firstName = inputFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String inputLastName) {
        this.lastName = inputLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

//    Methods

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void payInterest(double percentage) {
        double interestToPay = this.balance * percentage;
        this.balance += interestToPay;
    }

}
