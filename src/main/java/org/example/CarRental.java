package org.example;

public interface CarRental {
    /**
     * Dodaje nowego klienta do systemu.
     * @return Unikalny identyfikator (ID) nowego klienta.
     */
    String addCustomer(String firstName, String lastName, String driverLicenseNumber);

    /**
     * Usuwa klienta z systemu na podstawie jego ID.
     */
    void removeCustomer(String customerId);

    /**
     * Dodaje nowy samochód do salonu.
     * @return Unikalny identyfikator (ID) nowego samochodu.
     */
    String addCar(String brand, String model, String registrationNumber);

    /**
     * Usuwa samochód z salonu na podstawie jego ID.
     */
    void removeCar(String carId);

    /**
     * Przypisuje samochód do klienta (wypożycza go).
     * Na razie nie sprawdzamy, czy samochód jest już wypożyczony (choć powinniśmy!)
     */
    void rentCar(String carId, String customerId);

    /**
     * Zwraca samochód do salonu.
     */
    void returnCar(String carId);
}