package org.example;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String driverLicenseNumber;

    public Customer(String id, String firstName, String lastName, String driverLicenseNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getId() {
        return id;
    }
}
