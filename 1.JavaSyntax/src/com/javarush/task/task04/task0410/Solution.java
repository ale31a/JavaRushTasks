package com.javarush.task.task04.task0410;

/*  интервал от 50 до 100
Попадём-не-попадём
*/

import static java.lang.System.out;

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a) {
        if (a<100 & a>50)
        {System.out.println("Число "+a+" содержится в интервале.");}
        else
        {
            System.out.println("Число "+a+" не содержится в интервале.");}
        /* ::CODE: */
    }
}