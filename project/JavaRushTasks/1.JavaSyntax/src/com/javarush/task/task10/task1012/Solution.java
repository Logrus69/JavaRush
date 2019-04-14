package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        int[] masCount = new int[33];
        for(int i = 0; i < abcArray.length; i++)
        {
            int count = 0;
            for(String el : list)
            {
                for (int x = 0; x < el.length(); x++)
                    if (abcArray[i] == el.toCharArray()[x])
                    {
                        count++;
                    }
            }
            masCount[i] = count;
        }
        for(int i = 0; i < abcArray.length; i++)
            System.out.println(abcArray[i] + " " + masCount[i]);



        // напишите тут ваш код
    }

}
