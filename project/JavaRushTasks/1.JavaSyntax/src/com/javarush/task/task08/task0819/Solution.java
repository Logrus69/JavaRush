package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());//напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> mySet = new HashSet<>();
        mySet.add(new Cat());
        mySet.add(new Cat());
        mySet.add(new Cat());//напишите тут ваш код. step 2 - пункт 2
        return mySet;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat el : cats)
            System.out.println(el);// step 4 - пункт 4
    }

    public static class Cat {
        public Cat(){}
    }// step 1 - пункт 1
}
