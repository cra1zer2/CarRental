package org.example;

public interface CarRental {

    String addCustomer(String firstName, String lastName, String driverLicenseNumber);

    void removeCustomer(String customerId);

    String addCar(String brand, String model, String registrationNumber);

    void removeCar(String carId);

    void rentCar(String carId, String customerId);

    void returnCar(String carId);
}