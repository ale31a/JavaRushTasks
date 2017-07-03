package com.javarush.task.task04.task0428;

/* 
Положительное число
Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить количество положительных чисел в исходном наборе.
4. Если положительных чисел нет, программа должна вывести "0".
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int count = 0;
       int n1 = Integer.parseInt(reader.readLine());
       int n2 = Integer.parseInt(reader.readLine());
       int n3 = Integer.parseInt(reader.readLine());
       if (n1>0) count++;
        if (n2>0) count++;
        if (n3>0) count++;
        if (count==0) System.out.print("0");
        else System.out.print(count);
    }
}
