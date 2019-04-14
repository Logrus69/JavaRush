package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        Movie movie = null;
        while(true) {
            key = reader.readLine();
            if(!key.equals("cartoon") && !key.equals("thriller") && !key.equals("soapOpera")){
                movie = MovieFactory.getMovie(key);
                break;}
            else {movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());}
        }
    }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */


    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            else if("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            else if("thriller".equals(key)) {
                movie = new Thriller();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }


    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    public static class Cartoon extends Movie{

    }

    public static class Thriller extends Movie{

    }//Напишите тут ваши классы, пункт 3
}
