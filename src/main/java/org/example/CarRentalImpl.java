package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CarRentalImpl implements CarRental {
    private Map<String, Customer> customers = new HashMap<>();
    private Map<String, Car> cars = new HashMap<>();

    @Override
    public String addCustomer(String firstName, String lastName, String driverLicenseNumber) {
        if (firstName == null || lastName == null || driverLicenseNumber == null) {
            throw new IllegalArgumentException("All parameters must be non-null");
        }
        String newId = UUID.randomUUID().toString();
        Customer customer = new Customer(newId, firstName, lastName, driverLicenseNumber);
        customers.put(newId, customer);
        return newId;
    }

    @Override
    public void removeCustomer(String customerId) {
        customers.remove(customerId);
    }

    @Override
    public String addCar(String brand, String model, String registrationNumber) {
        if (brand == null || model == null || registrationNumber == null) {
            throw new IllegalArgumentException("All parameters must be non-null");
        }
        String newId = UUID.randomUUID().toString();
        Car car = new Car(newId, brand, model, registrationNumber);
        cars.put(newId, car);
        return newId;
    }

    @Override
    public void removeCar(String carId) {
        cars.remove(carId);
    }

    @Override
    public void rentCar(String carId, String customerId) {
    }

    @Override
    public void returnCar(String carId) {

    }
}
