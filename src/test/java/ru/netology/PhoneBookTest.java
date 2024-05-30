package ru.netology;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    void testAdd(){

        phoneBook.add("Петя", " 8-914-177-46-05");
        phoneBook.add("Петя", " 8-914-177-43-06");
        phoneBook.add("Вася", " 8-914-177-46-05");
        phoneBook.add("Вася", " 8-914-177-46-05");

        assertEquals(phoneBook.count, 2);
    }
    @Test
    void   testFindByNumber() {
        phoneBook.phoneBook.put("Петя", " 8-914-177-43-06");
        assertEquals(phoneBook.findByNumber(" 8-914-177-43-06"), "Петя");
    }
    @Test
    void testFindByName(){
        phoneBook.phoneBook.put("Петя", " 8-914-177-43-06");
        assertEquals(phoneBook.findByName("Петя"), " 8-914-177-43-06");
    }
@Test
void testPrintAllNames(){
    phoneBook.add("Петя", " 8-914-177-46-05");
    phoneBook.add("Вася", " 8-914-177-43-06");
    phoneBook.add("Сергей", " 8-914-177-43-07");
    List<String> expected = Arrays.asList("Вася", "Петя", "Сергей");
    List<String> result = phoneBook.printAllNames();

    assertEquals(expected, result);
}

}

