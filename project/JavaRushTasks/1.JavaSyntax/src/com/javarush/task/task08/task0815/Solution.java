package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> mySet = new HashMap<>();
        mySet.put("Kirill","Manzhos");
        mySet.put("Lubov","Manzhos");
        mySet.put("Ivan","Banan");
        mySet.put("Marina","Tereshenok");
        mySet.put("Marina1","Luxemburg");
        mySet.put("Aggd","Fffh");
        mySet.put("fg","jku");
        mySet.put("ege","jkuy");
        mySet.put("fwfw","rty");
        mySet.put("sdwq","bbvm");
        return mySet;//напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for(Map.Entry<String, String> entry : map.entrySet())
            if(name.equals(entry.getValue()))
                count++;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for(Map.Entry<String, String> entry : map.entrySet())
            if(lastName.equals(entry.getKey()))
                count++;
        return count;//напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
