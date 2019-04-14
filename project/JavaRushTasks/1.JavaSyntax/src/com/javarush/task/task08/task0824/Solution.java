package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human>children = new ArrayList<>();
        children.add(new Human("David", true, 7, new ArrayList<Human>()));
        children.add(new Human("Stiv", true, 6, new ArrayList<Human>()));
        children.add(new Human("Masha", false, 8, new ArrayList<Human>()));

        ArrayList<Human> p1 = new ArrayList<>();
        ArrayList<Human> p2 = new ArrayList<>();
        ArrayList<Human> g = new ArrayList<>();

        p1.add(new Human("Kirill", true,31, children));
        p2.add(new Human("Luba", false,35, children));
        g.add(new Human("BOris", true,58, p1));
        g.add(new Human("Oleg", true,56, p2));
        g.add(new Human("Nelia", false,56, p2));
        g.add(new Human("Sveta", false,58, p1));

        for(Human el : g)
            System.out.println(el);
        for(Human el : p1)
            System.out.println(el);
        for(Human el : p2)
            System.out.println(el);
        for(Human el : children)
            System.out.println(el);
        //напишите тут ваш код
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        ArrayList<Human> children = new ArrayList<>();
        public Human(String name, boolean sex, int age, ArrayList<Human>children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }//напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
