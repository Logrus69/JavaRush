package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        String mounth1 = scanner.nextLine();
        HashMap<Integer, String> map = new HashMap<>(12);
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");


        for(Map.Entry<Integer, String> el : map.entrySet())
            if(mounth1.equals(el.getValue()))
                System.out.println(String.format("%s is the %d month", mounth1, el.getKey()));
    }
}
