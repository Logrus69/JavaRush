package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution implements Country{
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        Hen hen1 = new UkrainianHen();
        System.out.println(hen1.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.BELARUS))
                hen = new BelarusianHen();
            else if (country == Country.MOLDOVA)
                hen =  new MoldovanHen();
            else if (country == Country.RUSSIA)
                hen = new RussianHen();
            else if(country == Country.UKRAINE)
                hen = new UkrainianHen();
            return hen;
            //напишите тут ваш код
        }
    }


}
