package org.example;

import java.util.HashMap;
import java.util.UUID;

public class CarRentalImpl implements CarRental {

    HashMap<String, Customer> customerMap = new HashMap<>();
    HashMap<String, Car> carMap = new HashMap<>();
    HashMap<String, String> carsRentedToCustomers =  new HashMap<>();


    @Override
    public String addCustomer(String firstName, String lastName, String driverLicenseNumber) {
        String id = UUID.randomUUID().toString();
        Customer customer = new Customer(firstName, lastName, driverLicenseNumber);
        customer.setCustomerId(id);
        customerMap.put(id, customer);
        return id;
    }

    @Override
    public void removeCustomer(String customerId) {
        customerMap.remove(customerId);
    }

    @Override
    public String addCar(String brand, String model, String registrationNumber) {
        String id = UUID.randomUUID().toString();
        Car car = new Car(brand, model, registrationNumber);
        car.setCarId(id);
        carMap.put(id, car);
        return id;
    }

    @Override
    public void removeCar(String carId) {
        carMap.remove(carId);
    }

    @Override
    public void rentCar(String carId, String customerId) {
        carsRentedToCustomers.put(carId, customerId);
    }

    @Override
    public void returnCar(String carId) {
        carsRentedToCustomers.remove(carId);
    }
}
