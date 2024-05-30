package ru.netology;

import java.util.*;

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
    Set<Map.Entry<String,String>> entrySet=phoneBook.entrySet();
    for (Map.Entry<String,String> pair : entrySet) {
        if (number.equals(pair.getValue())) {
            return pair.getKey();// нашли наше значение и возвращаем  ключ
        }
    }
return null;}
    String findByName(String s){
    return phoneBook.get(s);}

    public List<String> printAllNames() {

        return new ArrayList<>(phoneBook.keySet().stream().sorted().toList());
    }
    }