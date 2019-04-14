package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/
public class Solution {
public static void main(String[] args) throws Exception {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        Date date=new SimpleDateFormat("y-MM-dd").parse(read.readLine());
        SimpleDateFormat d=new SimpleDateFormat("MMM dd',' y", Locale.ENGLISH);
        System.out.println(d.format(date).toUpperCase());
        }
}
