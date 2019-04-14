package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream file = new FileInputStream(reader.readLine());
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(file));

        ArrayList<Integer> list = new ArrayList<>();
        Integer buffer;
        String line = "";

        while ((line = fileReader.readLine()) != null){

            buffer = Integer.parseInt(line);
            if(buffer%2 == 0) list.add(buffer);
        }

        reader.close();
        file.close();
        fileReader.close();

        Collections.sort(list);

        for(Integer el : list)
            System.out.println(el);

        // напишите тут ваш код
    }
}
