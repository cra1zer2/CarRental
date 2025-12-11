package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testCustomerCreation() {
        Customer customer = new Customer("1", "John", "Doe", "DL12345");
        assertEquals("1", customer.getId());
    }
}
