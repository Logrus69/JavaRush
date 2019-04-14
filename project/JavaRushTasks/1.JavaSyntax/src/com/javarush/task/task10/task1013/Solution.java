package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String Name;
        private  String LName;
        private  int Age;
        private  int Heigth;
        private Calendar DateBirsday;
        private Calendar DateOfDath;

        public Human(String name, String LName, int age, int heigth, Calendar dateBirsday, Calendar dateOfDath) {
            Name = name;
            this.LName = LName;
            Age = age;
            Heigth = heigth;
            DateBirsday = dateBirsday;
            DateOfDath = dateOfDath;
        }

        public Human(String name, String LName, int age, int heigth, Calendar dateBirsday) {
            Name = name;
            this.LName = LName;
            Age = age;
            Heigth = heigth;
            DateBirsday = dateBirsday;
        }

        public Human(String name, String LName, int age, int heigth) {
            Name = name;
            this.LName = LName;
            Age = age;
            Heigth = heigth;
        }

        public Human(String name, String LName, int age) {
            Name = name;
            this.LName = LName;
            Age = age;
        }

        public Human(String name, String LName) {
            Name = name;
            this.LName = LName;
        }

        public Human(String name) {
            Name = name;
        }
        public Human(){}

        public Human(int age, int heigth) {
            Age = age;
            Heigth = heigth;
        }

        public Human(Calendar dateBirsday, Calendar dateOfDath) {
            DateBirsday = dateBirsday;
            DateOfDath = dateOfDath;
        }

        public Human(String name, int age) {
            Name = name;
            Age = age;
        }
// Напишите тут ваши переменные и конструкторы
    }
}
