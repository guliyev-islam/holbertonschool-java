package com.iq;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.*;

public class PersonTest {

    private static Person person;

    @BeforeAll
    static void setup() {
        person = new Person(
            "Paul",
            "McCartney",
            LocalDate.of(2000, 1, 1),
            true,
            true,
            true
            );
    }

    @Test
    public void show_full_name() {
        assertEquals("Paul McCartney" ,person.fullName());
    }
    
    @Test
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI() {
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        person.setAnotherCompanyOwner(true);
        assertFalse(person.isMEI());
    }
}