package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args){

    }
    
    static {
        try {
            reset();
        }
        catch (IOException e){
            System.out.println(e);//add your code here - добавьте код тут
        }
    }

    public static CanFly result;

    public static void reset() throws IOException{
        String param = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int count;
            param = reader.readLine();
            if(param.equals("helicopter"))
                result = new Helicopter();
            if(param.equals("plane")){
                count = Integer.parseInt(reader.readLine());
                result = new Plane(count);
            }
        reader.close();
        //add your code here - добавьте код тут
    }
}
