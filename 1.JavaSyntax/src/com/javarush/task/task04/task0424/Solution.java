package com.javarush.task.task04.task0424;

/* 
Три числа

Давайте напишем программу, в которой пользователь вводит три числа с клавиатуры. Затем происходит сравнение, и если мы находим число, которое отличается от двух других, выводим на экран его порядковый номер.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        if       (n1==n2 && n1!=n3) System.out.print("3");
        else  if (n1==n3 && n1!=n2) System.out.print("2");
        else  if (n3==n2 && n1!=n3) System.out.print("1");


    }


}
