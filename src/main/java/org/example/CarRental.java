package org.example;

public interface CarRental {
    /**
     * ZADANIE: Zaimplementuj metodę dodającą nowego klienta do systemu.
     *
     * Co musi zrobić ta metoda:
     * 1. Sprawdzić, czy dane klienta są poprawne (np. nie są puste).
     * 2. Wygenerować unikalny identyfikator (ID) dla nowego klienta.
     * 3. Zapisać klienta w systemie (np. w mapie lub liście).
     *
     * @param firstName           Imię klienta.
     * @param lastName            Nazwisko klienta.
     * @param driverLicenseNumber Numer prawa jazdy.
     * @return Wygenerowane unikalne ID nowego klienta.
     */
    String addCustomer(String firstName, String lastName, String driverLicenseNumber);

    /**
     * ZADANIE: Zaimplementuj metodę usuwającą klienta.
     *
     * Co musi zrobić ta metoda:
     * 1. Znaleźć klienta o podanym ID.
     * 2. Usunąć go z systemu.
     * 3. (Opcjonalnie) Rzucić wyjątek, jeśli klient nie istnieje.
     *
     * @param customerId ID klienta do usunięcia.
     */
    void removeCustomer(String customerId);

    /**
     * ZADANIE: Zaimplementuj metodę dodającą nowy samochód do salonu.
     *
     * Co musi zrobić ta metoda:
     * 1. Sprawdzić poprawność danych (marka, model, rejestracja).
     * 2. Wygenerować unikalne ID samochodu.
     * 3. Dodać samochód do kolekcji dostępnych pojazdów.
     *
     * @param brand              Marka samochodu.
     * @param model              Model samochodu.
     * @param registrationNumber Numer rejestracyjny.
     * @return Wygenerowane unikalne ID nowego samochodu.
     */
    String addCar(String brand, String model, String registrationNumber);

    /**
     * ZADANIE: Zaimplementuj metodę usuwającą samochód.
     *
     * Co musi zrobić ta metoda:
     * 1. Znaleźć samochód o podanym ID.
     * 2. Usunąć go z systemu.
     *
     * @param carId ID samochodu do usunięcia.
     */
    void removeCar(String carId);

    /**
     * ZADANIE: Zaimplementuj metodę wypożyczają samochód klientowi.
     *
     * Co musi zrobić ta metoda:
     * 1. Sprawdzić, czy klient o podanym ID istnieje.
     * 2. Sprawdzić, czy samochód o podanym ID istnieje.
     * 3. Sprawdzić, czy samochód nie jest już wypożyczony przez kogoś innego!
     * 4. Przypisać samochód do klienta.
     *
     * @param carId      ID samochodu do wypożyczenia.
     * @param customerId ID klienta, który chce wypożyczyć auto.
     */
    void rentCar(String carId, String customerId);

    /**
     * ZADANIE: Zaimplementuj metodę zwracającą samochód do salonu.
     *
     * Co musi zrobić ta metoda:
     * 1. Znaleźć samochód po ID.
     * 2. Oznaczyć go jako "dostępny" (nieprzypisany do żadnego klienta).
     *
     * @param carId ID zwracanego samochodu.
     */
    void returnCar(String carId);
}