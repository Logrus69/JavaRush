package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Arrays.asList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(i == 0 || array[i-1] == ' ' && i < array.length - 1)
                array[i] = Character.toUpperCase(array[i]);
        }


        System.out.println(array);//напишите тут ваш код
    }
}
