package com.myclass;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService service;


    @BeforeEach
    void setUp() {
        service = new ContactService();
    }

    //test adding contact
    @Test
    void addContact() {
        Contact contact = new Contact("1", "Joe", "Dun", "1234523123", "12 Test St");
        service.addContact(contact);

        assertEquals(contact, service.getContact("1"));
    }

    //test if adding conact with null
    @Test
    void addContactNull() {
        assertThrows(
            IllegalArgumentException.class, () -> service.addContact(null)
        );
    }

    //tests adding conact with existing Id
    @Test
    void addContactExistingID() {

        Contact contact1 = new Contact("1", "Joe", "Dun", "1231237123", "12 Test St");
        service.addContact(contact1);

        Contact contact2 = new Contact("1", "Jane", "Doe", "1232344321", "123 Elme St");
        assertThrows(IllegalArgumentException.class, () -> service.addContact(contact2));
    }

    //tests getting null contact
    @Test
    void existingContactDelete() {
        Contact contact = new Contact("1", "Jon", "Dill", "1232342340", "12 test St");

        service.addContact(contact);

        service.deleteContact("1");

        assertNull(service.getContact("1"));
    }

    //deleting contact that doesn't exist
    @Test
    void nonExistingContact() {
        assertThrows(
            IllegalArgumentException.class, () -> service.deleteContact("doesNotExist")
        );
    }

    //updating existing conact
    @Test
    void existingContactUpdate() {
        Contact contact = new Contact("1", "Jack", "Dill", "1232342340", "123 Main St");

        service.addContact(contact);

        service.updateContact(
            "1", "Janey", "Toey", "0987234421", "123 Easy St"
        );

        Contact updatedContact = service.getContact("1");
        assertAll(
            () -> assertEquals("Janey", updatedContact.getFirstName()),
            () -> assertEquals("Toey", updatedContact.getLastName()),
            () -> assertEquals("0987234421", updatedContact.getPhone()),
            () -> assertEquals("123 Easy St", updatedContact.getAddress())
        );
    }

    //updating contach without Id
    @Test
    void updateNonExistingContactThrowsException() {
        assertThrows(IllegalArgumentException.class, 
        () -> service.updateContact(
            "null", "Jney", "Roen", "1231234321", "123 Easy St"
        ));
    }
}



