package ru.netology;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Test
    void testadd(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петя", " 8-914-177-46-05");
        phoneBook.add("Петя", " 8-914-177-43-06");
        phoneBook.add("Вася", " 8-914-177-46-05");
        phoneBook.add("Вася", " 8-914-177-46-05");

        assertEquals(phoneBook.count, 2);
    }


}