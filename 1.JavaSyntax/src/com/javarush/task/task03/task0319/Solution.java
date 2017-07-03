package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        «Имя» получает «число1» через «число2» лет.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        int intNumber1 = Integer.parseInt(number1);
        int intNumber2 = Integer.parseInt(number2);
        System.out.print(name +" " + "получает"+" " + intNumber1+ " " + "через"+" " + intNumber2 + " " + "лет.");
    }
}
