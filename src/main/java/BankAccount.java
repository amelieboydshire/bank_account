import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private Double balance;

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

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

//    Getters and setters

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
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
