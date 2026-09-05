# Lab Task 03 - Software Construction

**Course:** Software Construction (5th Semester)  
**Institution:** University of Engineering and Technology, Abbottabad Campus  
**Date:** September 05, 2026  

---

## Lab Objective

This lab introduces unit testing in Java using the JUnit framework within NetBeans IDE. The objective is to build modular Java classes and test their core functionalities using comprehensive unit test suites.

---

## Tasks Completed

### Task 1: Temperature Converter
* **Implementation:** `TemperatureConverter.java`
  * Implements `celsiusToFahrenheit`, `fahrenheitToCelsius`, and `celsiusToKelvin` conversion formulas.
* **Testing:** `TemperatureConverterTest.java`
  * Verifies known temperature pairs (0°C → 32°F and 100°C → 212°F).
  * Checks round-trip calculations and Kelvin conversions.

### Task 2: Bank Account Management
* **Implementation:** `BankAccount.java`
  * Manages account balances with `deposit()`, `withdraw()`, and `getBalance()` methods.
  * Throws `IllegalArgumentException` for invalid transaction amounts or insufficient funds.
* **Testing:** `BankAccountTest.java`
  * Validates successful deposits and withdrawals.
  * Tests edge cases like negative deposits and overdraft attempts using `assertThrows`.
