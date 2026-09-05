import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountHW2Test {

    private BankAccountHW2 account;

    @BeforeEach
    public void setUp() {
        account = new BankAccountHW2(150.0); // Starts active (balance >= 100)
    }

    @Test
    @DisplayName("1. Valid Deposit - Increases Balance")
    public void testValidDeposit() {
        account.deposit(50.0);
        assertEquals(200.0, account.getBalance(), 0.001);
        assertTrue(account.isActive());
    }

    @Test
    @DisplayName("2. Negative Deposit - Throws Exception")
    public void testNegativeDepositThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-20.0));
    }

    @Test
    @DisplayName("3. Overdraft Withdrawal - Throws Exception")
    public void testOverdraftThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
    }

    @Test
    @DisplayName("4. Account Inactivity - Balance Drops Below 100")
    public void testAccountBecomesInactiveAfterWithdrawal() {
        account.withdraw(60.0); // Balance becomes 90.0
        assertEquals(90.0, account.getBalance(), 0.001);
        assertFalse(account.isActive());
    }

    @Test
    @DisplayName("5. Account Reactivation - Deposit Brings Balance Back To 100+")
    public void testAccountReactivationViaDeposit() {
        account.withdraw(60.0); // Balance = 90.0, active = false
        assertFalse(account.isActive());
        account.deposit(20.0);  // Balance = 110.0, active = true
        assertTrue(account.isActive());
    }
}