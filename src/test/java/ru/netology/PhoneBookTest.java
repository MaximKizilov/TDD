package ru.netology;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    void testadd(){

        phoneBook.add("Петя", " 8-914-177-46-05");
        phoneBook.add("Петя", " 8-914-177-43-06");
        phoneBook.add("Вася", " 8-914-177-46-05");
        phoneBook.add("Вася", " 8-914-177-46-05");

        assertEquals(phoneBook.count, 2);
    }
    @Test
    void   findByNumber() {
        assertEquals(phoneBook.findByNumber(" 8-914-177-43-06"), "Петя");
    }



}