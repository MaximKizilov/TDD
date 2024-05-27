package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public  Map<String, String> phoneBook =new HashMap<>();
    int count = 0;
    public  void add(String key, String value){
        if (phoneBook.containsKey(key)) {
            phoneBook.put(key,  value);
        } else {
            phoneBook.put(key, value);
            count++;
        }
    }
public String findByNumber(String number){

return null;}


}