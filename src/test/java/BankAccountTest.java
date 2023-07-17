import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;

class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        BankAccount bankAccount = new BankAccount("Naeto","Chinua", "15-04-1998", 123987, 100.00);
    }

//    Getters and setters

    @Test
    public void hasFirstName() {
        assertThat(bankAccount.getFirstName()).isEqualTo("Naeto");
    }

    @Test
      public void canSetFirstName() {
          bankAccount.setFirstName("Naeto");
          assertThat(bankAccount.getFirstName()).isEqualTo("Daniel");
        }

    }

    @Test
    public void hasLastName() {
        assertThat(bankAccount.getLastName()).isEqualTo("Chinua");
    }

    @Test
    public void canSetLastName() {
        bankAccount.setLastName("Chinua");
        assertThat((bankAccount.getFirstName()).isEqualTo("Chinua");
    }

 @Test
    void hasDateOfBirth() {
      assertThat(bankAccount.getDateOfBirth()).isEqualTo("15-04-1998");



 }

 @Test
    public void canSetDateOfBirth() {
        bankAccount.setDateOfBirth("15-04-1998");
 }

 @Test
    public void hasAccountNumber() {
        assertThat(bankAccount.getAccountNumber()).isEqualTo(123987);
 }

 @Test
    public void canSetAccountNumber() {
        bankAccount.setAccountNumber(123987);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(123987);
 }

 @Test
    public void canGetBalance() {
        assertThat(bankAccount.getBalance()).isEqualTo(100);
 }

 @Test
    public void can SetBalance() {
        bankAccount.setBalance(100);
        assertThat(bankAccount.getBalance()).isEqualTo(100);
    }

// Tests for BankAccount methods

    @Test
    public void canDepositFunds() {
        bankAccount.deposit(20);
        assertThat(bankAccount.getBalance()).isEqualTo(120);
    }
    @Test
    public void canWithdrawFunds() {
        bankAccount.withdraw(10);
        assertThat(bankAccount.getBalance()).isEqualTo(90);
    }

    @Test
    public void canPayInterest() {
        bankAccount.payInterest(0.4);
        assertThat(bankAccount.getBalance()).isEqualTo(140);
    }


}