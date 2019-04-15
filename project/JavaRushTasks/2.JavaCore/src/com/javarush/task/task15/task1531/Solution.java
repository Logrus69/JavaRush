package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal bigDecimal = BigDecimal.ONE;
        if(n < 0)
            return Integer.toString(0);
        else if(n == 0)
            return Integer.toString(1);
        else if(n > 150)
            return "Введеное значение больше 150!";
        else {
            for (int i = 2; i <= n ; i++)
                bigDecimal = bigDecimal.multiply(new BigDecimal(i));//add your code here

            return bigDecimal.toString();
        }
    }
}
