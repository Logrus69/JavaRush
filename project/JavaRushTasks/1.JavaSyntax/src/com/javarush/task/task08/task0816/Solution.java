package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallone1", df.parse("MAY 1 1980"));
        map.put("Stallone2", df.parse("APRIL 1 1980"));
        map.put("Stallone3", df.parse("JUNE 1 1980"));
        map.put("Stallone4", df.parse("JUNE 1 1980"));
        map.put("Stallone5", df.parse("JUNE 1 1980"));
        map.put("Stallone6", df.parse("JUNE 1 1980"));
        map.put("Stallone7", df.parse("JUNE 1 1980"));
        map.put("Stallone8", df.parse("JUNE 1 1980"));
        map.put("Stallone9", df.parse("JUNE 1 1980"));
        return map;//напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();//напишите тут ваш код
        while(iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            {
                int month = pair.getValue().getMonth();
                if (month == 5 || month == 6 || month == 7)
                    iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {

    }
}
