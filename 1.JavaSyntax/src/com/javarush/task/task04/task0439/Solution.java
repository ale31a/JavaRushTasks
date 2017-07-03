package com.javarush.task.task04.task0439;

/* 
Письмо счастья
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: «*имя* любит меня.»

Пример вывода на экран для имени Света:
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        for (int i = 1; i<11;i++) {
            System.out.println(s+" любит меня.");
        }

    }
}
