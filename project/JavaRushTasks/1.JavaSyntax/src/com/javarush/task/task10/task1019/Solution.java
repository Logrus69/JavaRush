package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int id;
        String name;
        String str;
        while (true) {
            str = reader.readLine();
            if (str.isEmpty()) break;
            else id = Integer.parseInt(str);
            name = reader.readLine();
            if (!name.isEmpty()) {
                map.put(name, id);
            }
            else {
                map.put(name, id);
                break;
            }
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()){
            id = pair.getValue();
            name = pair.getKey();
            System.out.println(id + " " + name);
        }




    }
}
