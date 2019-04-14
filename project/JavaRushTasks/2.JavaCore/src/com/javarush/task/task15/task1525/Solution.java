package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(true){
            String str = null;
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(str == null) break;
            lines.add(str);
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
