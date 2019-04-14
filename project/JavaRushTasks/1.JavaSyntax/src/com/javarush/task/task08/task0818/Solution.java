package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        Random random = new Random();
        HashMap<String, Integer> myMap = new HashMap<>();
        for(int i = 0; i < 10; i++)
        {
            myMap.put("Name" + i, random.nextInt(1000));
        }
        return myMap;//напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext())
            if(itr.next().getValue() < 500)
                itr.remove();//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}