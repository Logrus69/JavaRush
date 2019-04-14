package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("арбуз","ягода");
        myMap.put("банан","трава");
        myMap.put("вишня","ягода");
        myMap.put("груша","фрукт");
        myMap.put("дыня","овощ");
        myMap.put("ежевика","куст");
        myMap.put("жень-шень","корень");
        myMap.put("земляника","ягода");
        myMap.put("ирис","цветок");
        myMap.put("картофель","клубень");

        for(Map.Entry item : myMap.entrySet())
            System.out.println(item.getKey() + " : " + item.getValue());//напишите тут ваш код

    }
}
