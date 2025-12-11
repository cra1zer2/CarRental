package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarRentalImplTest {

    private CarRentalImpl carRental;

    @BeforeEach
    void setUp() {
        carRental = new CarRentalImpl();
    }

    @Test
    void addCustomer() {
        String customerId = carRental.addCustomer("John", "Doe", "DL123");
        assertNotNull(customerId);
    }

    @Test
    void addCustomer_NullArgs() {
        assertThrows(IllegalArgumentException.class, () -> carRental.addCustomer(null, "Doe", "DL123"));
    }

    @Test
    void removeCustomer() {
        String customerId = carRental.addCustomer("John", "Doe", "DL123");
        carRental.removeCustomer(customerId);
        // Verify removal implicitly by trying to rent a car to this customer (should
        // fail)
        String carId = carRental.addCar("Toyota", "Camry", "ABC-123");
        assertThrows(IllegalArgumentException.class, () -> carRental.rentCar(carId, customerId));
    }

    @Test
    void addCar() {
        String carId = carRental.addCar("Toyota", "Camry", "ABC-123");
        assertNotNull(carId);
    }

    @Test
    void addCar_NullArgs() {
        assertThrows(IllegalArgumentException.class, () -> carRental.addCar(null, "Camry", "ABC-123"));
    }

    @Test
    void removeCar() {
        String carId = carRental.addCar("Toyota", "Camry", "ABC-123");
        carRental.removeCar(carId);
        String customerId = carRental.addCustomer("John", "Doe", "DL123");
        assertThrows(IllegalArgumentException.class, () -> carRental.rentCar(carId, customerId));
    }

    @Test
    void rentCar() {
        String carId = carRental.addCar("Toyota", "Camry", "ABC-123");
        String customerId = carRental.addCustomer("John", "Doe", "DL123");
        carRental.rentCar(carId, customerId);
        // No exception means success. Further verification would require access to
        // internal state or getters in CarRentalImpl
    }

    @Test
    void rentCar_CarAlreadyRented() {
        String carId = carRental.addCar("Toyota", "Camry", "ABC-123");
        String customerId1 = carRental.addCustomer("John", "Doe", "DL123");
        String customerId2 = carRental.addCustomer("Jane", "Smith", "DL456");

        carRental.rentCar(carId, customerId1);
        assertThrows(IllegalArgumentException.class, () -> carRental.rentCar(carId, customerId2));
    }

    @Test
    void returnCar() {
        String carId = carRental.addCar("Toyota", "Camry", "ABC-123");
        String customerId = carRental.addCustomer("John", "Doe", "DL123");
        carRental.rentCar(carId, customerId);
        carRental.returnCar(carId);

        // Should be able to rent again
        carRental.rentCar(carId, customerId);
    }

    @Test
    void returnCar_NotRented() {
        String carId = carRental.addCar("Toyota", "Camry", "ABC-123");
        assertThrows(IllegalArgumentException.class, () -> carRental.returnCar(carId));
    }
}