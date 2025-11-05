package org.example;

public class Customer {
    private String firstName;
    private String lastName;
    private String driverLicenseNumber;
    private String customerId;

    public Customer(String firstName, String lastName, String driverLicenseNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
