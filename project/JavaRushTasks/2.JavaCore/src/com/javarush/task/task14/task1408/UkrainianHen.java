package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    public UkrainianHen(){

    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 100500;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
