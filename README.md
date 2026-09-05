# Lab Task 03 - Software Construction

**Course:** Software Construction (5th Semester)  
**Institution:** University of Engineering and Technology, Abbottabad Campus  
**Date:** September 05, 2026  

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
