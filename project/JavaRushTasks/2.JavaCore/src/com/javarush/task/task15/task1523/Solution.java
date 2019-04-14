package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    int a, b, c;

    public Solution(){}

    protected Solution(int a, int b){
        this.a = a;
        this.b = b;
    }
    private Solution(int b){
        this.b = b;
    }
    Solution(int c, int a, int b){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public static void main(String[] args) {

    }

}

