package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] mas = s.toCharArray();
        int count = 0;
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < mas.length; i++)
            list.add(mas[i]);

        int size = list.size();

        for(int j = 0; j < size - 7; j++)
        {
            if(count > 0)
            {
                list.remove(0);
                for(char el : list)
                    System.out.print(el);
                System.out.println();
            }
            else {for(char el : list)
                System.out.print(el);
                System.out.println();
            }
            count++;
        }
        //напишите тут ваш код
    }

}

