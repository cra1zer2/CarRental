# Car Rental System 🚗

**Status:** ✅ School Project Completed

A simple backend system for managing a car rental service, implementing core business logic for inventory and rentals.

## 🎯 Functionality Accomplished

*   **Car Management**:
    *   Add new vehicles (Brand, Model, License Plate).
    *   Remove vehicles from the fleet.
    *   Track availability status.
*   **Customer Management**:
    *   Register and remove customers.
    *   Auto-generate unique Customer IDs.
*   **Rental Operations**:
    *   **Rent**: securely link available cars to customers.
    *   **Return**: process returns and free up vehicle availability.
    *   **Validation**: Error handling for invalid IDs, null inputs, or double-booking attempts.
*   **Quality Assurance**:
    *   Full Unit Test coverage using **JUnit**.

## 🛠️ Tech Stack

*   Java
*   Maven
*   JUnit 5

## 🚀 How to Run

To run the tests and verify functionality:

```bash
mvn test