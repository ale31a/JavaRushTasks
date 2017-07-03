package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел

Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        if ( n1<n2 ) {
            System.out.print(n1);
        } else
            if (n1>n2) {
                System.out.print(n2);
            } else System.out.print(n1);
    }
}