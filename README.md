# Lab Task 03 - Task 1: Temperature Converter
**Course:** Software Construction (5th Semester)  
**Institution:** University of Engineering and Technology, Abbottabad Campus  
**Date:** September 01, 2026  

---

## Lab Objective
This lab introduces unit testing in Java using the JUnit framework within NetBeans IDE. The objective of Task 1 is to test the correctness of temperature conversion formulas between Celsius, Fahrenheit, and Kelvin.

---

## Task Completed

### Task 1: Temperature Converter
* **Implementation:** `TemperatureConverter.java`
  * Implements `celsiusToFahrenheit`, `fahrenheitToCelsius`, and `celsiusToKelvin` conversion formulas.
* **Testing:** `TemperatureConverterTest.java`
  * Verifies known temperature pairs ($0^\circ\text{C} \rightarrow 32^\circ\text{F}$ and $100^\circ\text{C} \rightarrow 212^\circ\text{F}$).
  * Checks round-trip calculations (`fahrenheitToCelsius(celsiusToFahrenheit(x)) ≈ x`).
  * Asserts approximate equality using `assertEquals(expected, actual, 0.01)`.

---

## How to Run the Code & Tests

### Prerequisites
* Java Development Kit (JDK 11 or higher)
* NetBeans IDE 
* JUnit 5 Library

### Execution Steps
1. Open **NetBeans IDE**.
2. Click **File -> Open Project** and select the `lab3` folder.
3. Open `TemperatureConverter.java` in the editor.
4. To run automated JUnit tests, right-click the project (or `TemperatureConverterTest.java`) and select **Test** (or press `Alt + F6`).
5. Verify that all unit tests pass with a 100% green execution status.
