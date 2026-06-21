# Exercise 7: Financial Forecasting

## Objective

The objective of this exercise is to understand recursion and its application in financial forecasting. The program predicts future values based on a given growth rate and a specified number of years.



## Problem Statement

You are developing a financial forecasting tool that predicts future values based on past data.

### Tasks

1. Explain the concept of recursion.
2. Create a recursive method for forecasting.
3. Predict future values using a recursive algorithm.
4. Analyze the time complexity.
5. Discuss optimization techniques.



## Understanding Recursion

Recursion is a programming technique where a method calls itself to solve a smaller version of the same problem.

A recursive solution consists of:

### Base Case

The condition that stops the recursion.

Example:

If the number of years becomes 0, return the current value.

### Recursive Case

The method calls itself with updated parameters until the base case is reached.

---

## Financial Forecasting Formula

Future Value is calculated using the growth rate applied every year.

Formula:

Future Value = Present Value × (1 + Growth Rate)

For example:

Initial Value = ₹10,000

Growth Rate = 10%

Year 1 = ₹11,000

Year 2 = ₹12,100

Year 3 = ₹13,310

The recursive method repeatedly applies this growth until the specified number of years is completed.

---

## Algorithm Used

### Recursive Forecasting

The recursive method performs the following steps:

1. Check whether the number of years is 0.
2. If yes, return the current value.
3. Otherwise, calculate the next year's value.
4. Call the same method again with updated values.

This process continues until the base condition is reached.

---

## Implementation Summary

The program accepts:

* Current Value
* Annual Growth Rate
* Number of Years

A recursive method is used to calculate the future value.

The result is displayed after all recursive calls are completed.

---

## Complexity Analysis

### Time Complexity

For every year, one recursive call is made.

T(n) = T(n-1) + O(1)

Therefore:

Time Complexity = O(n)

where n is the number of years.

---

### Space Complexity

Each recursive call occupies stack memory.

Space Complexity = O(n)

because n recursive calls are stored in the call stack.

---

## Optimization

### Limitation of Recursion

For very large values of n, recursion may create too many function calls and lead to StackOverflowError.

### Better Approach

An iterative solution using a loop can be used.

Advantages:

* Uses constant memory.
* Avoids recursion overhead.
* More suitable for large inputs.

Space Complexity becomes O(1).

---

## Real-World Applications

Financial forecasting techniques are commonly used in:

* Investment planning
* Banking systems
* Revenue prediction
* Business growth analysis
* Stock market estimation

---

## Conclusion

This exercise demonstrates how recursion can be used to solve forecasting problems. The recursive approach is simple and easy to understand, making it suitable for educational purposes. However, for large datasets or long forecasting periods, iterative solutions provide better memory efficiency and performance.
