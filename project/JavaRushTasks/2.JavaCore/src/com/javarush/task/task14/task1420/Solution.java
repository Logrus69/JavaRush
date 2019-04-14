package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int number1 = Integer.parseInt(reader.readLine());
       int number2 = Integer.parseInt(reader.readLine());

       if(number1 <=0 || number2 <= 0) throw new Exception();

       int max;
       int NOD = 0;
       if(number1 > number2)
           max = number1;
       else max = number2;

       for(int i = 1; i <= max; i++)
           if(number1%i == 0 && number2%i == 0)
               NOD = i;
        System.out.println(NOD);
 }
}
