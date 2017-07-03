package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Пример для чисел 1 2 2 4 5 -1:
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sr=0;
        for (int i = 0; ; i++) {
            double s = Double.parseDouble(reader.readLine());
            if (s==-1) {
                sr = sr/(i);
                break;}
                sr = sr+s;

        }
        System.out.println(sr);
    }
}

