package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        /*int [] mas = {1};
        int g=0;
        String a = null;
        String b= "d";
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            System.out.println(mas[2]);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String s = "1 / 0";
            int i=Integer.parseInt(s);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            a.equals(b);
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        }
        catch (Exception e){
            exceptions.add(e);
        }

       try {
           Object x = new Integer(0);
            System.out.println((String)x);
       }
        catch (Exception e){
           exceptions.add(e);
       }

        try{
            FileReader reader = new FileReader("notes3.txt");
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try{
            g= Integer.parseInt(b);
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            Object y[] = new String[-3];
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            Stack st = new Stack();
            st.empty();
            st.peek();
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            Object[] str = new String[10];
            str[0] = new Character('%');
        }catch(ArrayStoreException e) {
            exceptions.add(e);
        }*/


        exceptions.add(new ArithmeticException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ClassCastException());
        exceptions.add(new NullPointerException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new InputMismatchException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new ArrayStoreException());
        //напишите тут ваш код

    }
}


/*java.lang.ArithmeticException: / by zero
java.lang.ArrayIndexOutOfBoundsException: 5
java.lang.ClassCastException: java.base/java.lang.Double cannot be cast to java.base/java.lang.Float
java.lang.NullPointerException
java.io.FileNotFoundException:  (Result too large)
java.util.InputMismatchException
java.lang.NumberFormatException: For input string: "fsdg"
java.lang.IllegalArgumentException: Cannot format given Object as a Date
java.lang.IndexOutOfBoundsException: Index 10 out-of-bounds for length 0
java.lang.ArrayStoreException: java.lang.Character*/