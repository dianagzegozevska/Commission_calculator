# Fintech Commission Calculator

A precision-focused Java console application designed to calculate payment commissions. This project demonstrates the core logic of financial calculations, avoiding common floating-point errors by using BigDecimal.

## About The Project
The goal was to build a calculator that handles monetary values correctly, adhering to banking standards for rounding and precision.

## Tech Stack
* Language: Java 21 (LTS)
* Core Logic: java.math.BigDecimal
* Rounding Strategy: RoundingMode.HALF_UP (Banker's rounding)
* Input: java.util.Scanner

## Key Features
* Financial Precision: Uses BigDecimal instead of double to prevent precision loss (e.g., 0.1 + 0.2 problem).
* Dynamic Input: Accepts any amount and commission percentage from the user via console.
* Banking Standard: Applies HALF_UP rounding to 2 decimal places (standard for currency).
* Error Handling: (In progress) Handles input mismatches based on locale (comma vs dot).

## Example Usage

```text
=== Калькулятор комісій ===
Введіть суму платежу: 1000,00
Введіть відсоток комісії (наприклад, 2,5): 2,5

--- Результат ---
Сума комісії: 25.00
Фінальна сума до сплати: 1025.00
-----------------
