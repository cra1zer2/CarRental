package org.example;

public class Main {
    public static void main(String[] args) {
        CarRentalImpl carRental = new CarRentalImpl();
        String misa = carRental.addCar("Misato", "delorian", "5267");
        String customer = carRental.addCustomer("Chester", "Stone", "Beer");
        carRental.rentCar(misa, customer);
    }
}
