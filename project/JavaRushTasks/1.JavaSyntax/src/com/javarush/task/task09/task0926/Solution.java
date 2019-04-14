package com.javarush.task.task09.task0926;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел 5, 2, 4, 7, 0
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[]arr1 = {0,1,2,3,4};
        int[]arr2 = {0,1};
        int[]arr3 = {0,1,2,3};
        int[]arr4 = {0,1,2,3,4,5,6};
        int[]arr5 = {};
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        list.add(arr5);
        return list;//напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
