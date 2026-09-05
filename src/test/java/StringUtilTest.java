import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    public void testValidPalindrome() {
        StringUtil util = new StringUtil();
        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeWithSpacesAndCase() {
        StringUtil util = new StringUtil();
        assertTrue(util.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testNonPalindrome() {
        StringUtil util = new StringUtil();
        assertFalse(util.isPalindrome("hello"));
    }

    @Test
    public void testNullInput() {
        StringUtil util = new StringUtil();
        assertFalse(util.isPalindrome(null));
    }
}