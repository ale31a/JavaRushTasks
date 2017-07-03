package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код   Ввести с клавиатуры число n.
       // Вывести на экран надпись «Я буду зарабатывать $n в час».
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        System.out.println("Я буду зарабатывать $"+ n + " в час");




    }
}
