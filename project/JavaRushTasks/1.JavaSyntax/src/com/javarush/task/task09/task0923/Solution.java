package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> array1 = new ArrayList<>();
        ArrayList<Character> array2 = new ArrayList<>();
        String text = reader.readLine();
        char [] arr = text.toCharArray();
        for(int i = 0; i < arr.length; i++)
            if(isVowel(arr[i]))
                array1.add(arr[i]);
            else if(!isVowel(arr[i]) && arr[i] != ' ')
                array2.add(arr[i]);
        for(char el : array1)
            System.out.print(el + " ");
        System.out.println();
        for(char el : array2)
            System.out.print(el + " ");//напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}