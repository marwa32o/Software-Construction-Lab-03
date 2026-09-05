# Lab Task 03 - Software Construction

**Course:** Software Construction (5th Semester)  
**Institution:** University of Engineering and Technology, Abbottabad Campus  
**Date:** September 05, 2026  
**Repository:** https://github.com/marwa32o/Software-Construction-Lab-03

---

## Lab Objective

This lab introduces unit testing in Java using the JUnit 5 framework within NetBeans IDE. The objective is to construct modular, robust Java utility classes and verify their functionality, edge cases, and exception handling using comprehensive test suites.

---

## Tasks Completed

### Task 1: Temperature Converter
* **Implementation:** `TemperatureConverter.java`
  * Implements `celsiusToFahrenheit`, `fahrenheitToCelsius`, and `celsiusToKelvin` conversion formulas.
* **Testing:** `TemperatureConverterTest.java`
  * Verifies known temperature pairs (0°C → 32°F and 100°C → 212°F), round-trip consistency, and Kelvin conversions.

### Task 2: Bank Account Management
* **Implementation:** `BankAccount.java`
  * Manages account balances using `deposit()`, `withdraw()`, and `getBalance()`.
  * Throws `IllegalArgumentException` for non-positive transaction amounts or overdraft attempts.
* **Testing:** `BankAccountTest.java`
  * Validates successful deposits/withdrawals and asserts exception handling using `assertThrows`.

### Task 3: String Utility (Palindrome Checker)
* **Implementation:** `StringUtil.java`
  * Implements `isPalindrome()` to check string equality while ignoring non-alphanumeric characters and case sensitivity.
* **Testing:** `StringUtilTest.java`
  * Verifies simple words, multi-word phrases, non-palindromes, and `null` values.

### Task 4: Simple Timer Utility
* **Implementation:** `SimpleTimer.java`
  * Tracks elapsed time via `start()`, `stop()`, `getElapsedTime()`, and `isRunning()`.
* **Testing:** `SimpleTimerTest.java`
  * Asserts state toggles (`running` status) and verifies precise time recording using controlled thread execution delays.

### Task 5: Shopping Cart (Mini Case Study)
* **Implementation:** `ShoppingCart.java`
  * Implements `addItem()`, `removeItem()`, `getItemCount()`, and `clear()` methods using a generic `List<String>` to simulate business rules.
* **Testing:** `ShoppingCartTest.java`
  * Tests adding items, removing items, clearing the cart, and verifying that removing non-existent items executes safely without throwing exceptions.

---

## Homework Tasks

### Homework 1: Enhanced Calculator

- **Implementation:** `Calculator1.java`
  * Extends the in-lab calculator with `power(int base, int exp)` and `modulus(int a, int b)` methods.
  * `modulus()` throws `IllegalArgumentException` when dividing by zero.
- **Testing:** `Calculator1Test.java`
  * Uses `@BeforeEach`/`@AfterEach` to create and reset the calculator instance before/after every test.
  * Covers normal, boundary (zero exponent, a < b), and exceptional (modulus by zero) cases.
  

### Homework 2: Account Validation

- **Implementation:** `BankAccountHW2.java`
  * Implements `deposit()`, `withdraw()`, `getBalance()`, and `isActive()`.
  * Disallows negative deposits and withdrawals exceeding the current balance.
  * Marks the account inactive if the balance drops below 100 after a withdrawal.
- **Testing:** `BankAccountHW2Test.java`
  * 7 test cases using `assertThrows`, `assertTrue`, `assertFalse`: valid deposit, negative deposit, overdraft, inactivity trigger, staying active, zero withdrawal, and withdrawal equal to balance.

### Homework 3: String Utility Testing

- **Implementation:** `StringAnalyzer.java`
  * Implements `isPalindrome()`, `countVowels()`, and `isAnagram()`.
  * Null and empty inputs return `false`/`0` rather than throwing.
- **Testing:** `StringAnalyzerTest.java`
  * 13 test cases with `@DisplayName` annotations, covering case-insensitivity, empty/null inputs, and various vowel-count scenarios.
