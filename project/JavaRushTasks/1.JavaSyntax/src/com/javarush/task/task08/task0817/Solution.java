package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("Манжос","Кирилл");
        myMap.put("Терешенок","Марина");
        myMap.put("Уинстон","Черчель");
        myMap.put("Джастин","Бибер");
        myMap.put("Анджелина","Джоли");
        myMap.put("Игнатов","Руслан");
        myMap.put("Сусоев","Руслан");
        myMap.put("Поттер","Гарри");
        myMap.put("Ибен","Азиз");
        myMap.put("Тесте","Стерон");
        return myMap;//напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> list = new ArrayList<>(map.values());
        for(String el : list)
            if(Collections.frequency(list, el) > 1)
                removeItemFromMapByValue(map, el);//напишите тут ваш код


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
