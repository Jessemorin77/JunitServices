package com.myclass;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContactTest {

    //tests if conactId too long
    @Test
    void contactIDTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "joey", "dun", "1232347899", "12 Easy St");
        });
    } 

    //gets error if id is null
    @Test
    void contactIdNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "joey", "don", "1234123899", "12 Easy St");
        });
    }

    //error if first name is null
    @Test
    void firstNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", null, "joey", "1234123899", "123 easy St");
        });
    }

    //error if first name too long
    @Test
    void firstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "joeeeeeeeeeee", "Dull", "1234123890", "123 easy St");
        });
    }

    //error if last name null
    @Test
    void lastNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "joe", null, "1234123890", "12 Easy st");
        });
    }

    //error if last name too long
    @Test
    void lastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", "joeeeeeeeeeee", "1234123890", "1 easy St");
        });
    }

    //error if wrong phone length
    @Test
    void phoneNumberLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "joey", "Dull", "123456789", "1 Easy st");
        });
    }

    //error it number is null
    @Test
    void phoneNumberNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "jess", "Dull", null, "1 man St");
        });
    }

    //error if address null
    @Test
    void addressNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "jess", "more", "1231231290", null);
        });
    }

    //error if address too long
    @Test
    void addressLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "Jesse", "Dill", "1231237890", "1asdfaasdfsdfsadfasdfasdfasdfasdf");
        });
    }
}

