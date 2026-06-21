# Exercise 2: E-Commerce Platform Search Function

## Objective

The goal of this exercise is to understand how searching algorithms work in an e-commerce platform. When users search for products, the system should return results quickly and efficiently. This exercise compares Linear Search and Binary Search and analyzes their performance using Big O notation.

---

## Problem Statement

You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.

### Tasks

1. Explain Big O notation and its importance.
2. Describe best, average, and worst-case scenarios for searching.
3. Create a Product class with productId, productName, and category.
4. Implement Linear Search and Binary Search algorithms.
5. Store products in an array and perform search operations.
6. Compare the performance of both algorithms.

---

## Understanding Big O Notation

Big O notation is used to measure the efficiency of an algorithm as the input size increases.

It helps us:

* Compare different algorithms.
* Predict execution time for large datasets.
* Choose the most efficient solution.

### Common Complexities

| Complexity | Meaning          |
| ---------- | ---------------- |
| O(1)       | Constant Time    |
| O(log n)   | Logarithmic Time |
| O(n)       | Linear Time      |
| O(n²)      | Quadratic Time   |

---

## Search Scenarios

### Best Case

The product is found immediately.

Example:
Searching for "Laptop" when it is the first element in the array.

Complexity: O(1)

### Average Case

The product is found somewhere in the middle.

Complexity: O(n)

### Worst Case

The product is the last element or does not exist.

Complexity: O(n)

---

## Algorithms Used

### Linear Search

Linear Search checks each product one by one until the target product is found.

Advantages:

* Works on both sorted and unsorted data.
* Easy to implement.

Disadvantage:

* Slower for large datasets.

Time Complexity:

* Best Case: O(1)
* Average Case: O(n)
* Worst Case: O(n)

---

### Binary Search

Binary Search repeatedly divides the search space into halves.

Requirement:

* Data must be sorted before performing Binary Search.

Advantages:

* Much faster than Linear Search.
* Suitable for large product catalogs.

Time Complexity:

* Best Case: O(1)
* Average Case: O(log n)
* Worst Case: O(log n)

---

## Implementation Summary

A Product class was created to store product details such as productId, productName, and category.

Products were stored in an array.

Two search methods were implemented:

1. Linear Search
2. Binary Search

The array was sorted before performing Binary Search.

---

## Analysis

| Operation    | Linear Search | Binary Search |
| ------------ | ------------- | ------------- |
| Best Case    | O(1)          | O(1)          |
| Average Case | O(n)          | O(log n)      |
| Worst Case   | O(n)          | O(log n)      |

Binary Search performs significantly better for large datasets because it eliminates half of the search space during each iteration.

---

## Conclusion

This exercise demonstrates the importance of efficient searching techniques in e-commerce applications. While Linear Search is simple and works on unsorted data, Binary Search provides much better performance on sorted data. Therefore, Binary Search is preferred when handling large product inventories.
