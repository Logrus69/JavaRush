package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public static void divideByZero()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
           int divideByZero = number / 0;
        System.out.println(divideByZero);
    }
}
