package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCarCreation() {
        Car car = new Car("1", "Toyota", "Camry", "ABC-123");
        assertEquals("1", car.getId());
        assertFalse(car.isRented());
        assertNull(car.getRentedBy());
    }

    @Test
    void testRentCar() {
        Car car = new Car("1", "Toyota", "Camry", "ABC-123");
        car.setRentedBy("customer1");
        assertTrue(car.isRented());
        assertEquals("customer1", car.getRentedBy());
    }

    @Test
    void testReturnCar() {
        Car car = new Car("1", "Toyota", "Camry", "ABC-123");
        car.setRentedBy("customer1");
        car.setRentedBy(null);
        assertFalse(car.isRented());
        assertNull(car.getRentedBy());
    }
}
