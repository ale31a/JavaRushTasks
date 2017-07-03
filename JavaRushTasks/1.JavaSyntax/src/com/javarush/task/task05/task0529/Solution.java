package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово «сумма».
Вывести на экран полученную сумму.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0;  ; i++) {
            String s = bufferedReader.readLine();
            if (s.equals("сумма")) {
                break;}
            sum+=Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
