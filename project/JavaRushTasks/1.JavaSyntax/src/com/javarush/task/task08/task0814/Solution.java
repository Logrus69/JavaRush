package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> mySet =new HashSet<>();
        mySet.add(1);
        mySet.add(30);
        mySet.add(15);
        mySet.add(12);
        mySet.add(8);
        mySet.add(9);
        mySet.add(11);
        mySet.add(61);
        mySet.add(91);
        mySet.add(18);
        mySet.add(100);
        mySet.add(2);
        mySet.add(6);
        mySet.add(17);
        mySet.add(23);
        mySet.add(27);
        mySet.add(78);
        mySet.add(13);
        mySet.add(10);
        mySet.add(29);
        return mySet;
        // напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
