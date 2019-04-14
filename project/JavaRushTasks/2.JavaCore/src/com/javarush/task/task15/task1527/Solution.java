package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();
        String params;
        String tmp;
        String [] arrParams;
        int ind;
        ArrayList<String> objParams = new ArrayList<>();
        ind = URL.indexOf('?');
        params = URL.substring(ind + 1, URL.length());
        arrParams = params.split("&");
        for (String el : arrParams){
            ind = el.indexOf("=");
            if(ind > 0){
                tmp = el.substring(0, ind);
                System.out.println(tmp + " ");
                if(tmp.contains("obj"))
                    objParams.add(el.substring(ind + 1));
            }
            else
                System.out.println(el + " ");
        }
        System.out.println();
        for (String v: objParams){
            try {
                alert(Double.parseDouble(v));//пробуем его конвертировать в дабл и, если успешно - печатаем в консоль
            }catch (NumberFormatException e){
                alert(v);//при невозможности конвертации печатаем как стринг
            }
        }
    }





    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
