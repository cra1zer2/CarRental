package org.example;

public class Car {
    private String id;
    private String brand;
    private String model;
    private String registrationNumber;
    private String rentedByCustomerId;

    public Car(String id, String brand, String model, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.rentedByCustomerId = null;
    }

    public String getId() {
        return id;
    }

    public boolean isRented() {
        return rentedByCustomerId != null;
    }

    public void setRentedBy(String customerId) {
        this.rentedByCustomerId = customerId;
    }

    public String getRentedBy() {
        return rentedByCustomerId;
    }
}
