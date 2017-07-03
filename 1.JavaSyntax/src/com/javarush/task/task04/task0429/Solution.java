package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа

количество отрицательных чисел: 0
количество положительных чисел: 3

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить количество отрицательных чисел в исходном наборе.
4. Программа должна выводить количество положительных чисел в исходном наборе.
5. Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
6. Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
7. Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int a = 0;
        int b = 0;
        System.out.println("количество отрицательных чисел: " + kolOtric(n1,n2,n3));
        System.out.println("количество положительных чисел: " + kolPol(n1,n2,n3));
    }
    private static int kolPol(int n1, int n2, int n3) {
        int a=0;
        if (n1>0) a++;
        if (n2>0) a++;
        if (n3>0) a++;
        return a;
    }

    private static int kolOtric(int n1, int n2, int n3) {
        int a=0;
        if (n1<0) a++;
        if (n2<0) a++;
        if (n3<0) a++;
        return a;
    }
}
