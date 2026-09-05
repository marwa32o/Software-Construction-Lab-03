import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountHW2Test {
    private BankAccountHW2 account;

    @BeforeEach
    void setUp() {
        account = new BankAccountHW2(500.0);
    }

    @AfterEach
    void tearDown() {
        account = null;
    }

    @Test
    void testValidDeposit() {
        account.deposit(200.0);
        assertEquals(700.0, account.getBalance(), 0.001);
        assertTrue(account.isActive());
    }

    @Test
    void testNegativeDepositThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50.0));
    }

    @Test
    void testOverdraftThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(1000.0));
    }

    @Test
    void testWithdrawalCausesInactivity() {
        account.withdraw(450.0);
        assertEquals(50.0, account.getBalance(), 0.001);
        assertFalse(account.isActive());
    }

    @Test
    void testWithdrawalKeepsAccountActive() {
        account.withdraw(300.0);
        assertEquals(200.0, account.getBalance(), 0.001);
        assertTrue(account.isActive());
    }

    @Test
    void testZeroWithdrawalThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0.0));
    }

    @Test
    void testWithdrawalEqualToBalance() {
        account.withdraw(500.0);
        assertEquals(0.0, account.getBalance(), 0.001);
        assertFalse(account.isActive());
    }
}