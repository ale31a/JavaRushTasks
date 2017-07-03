package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде «21 02 2014«.
*/


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(day + " " + (month+1) + " " + year);
    }
}
