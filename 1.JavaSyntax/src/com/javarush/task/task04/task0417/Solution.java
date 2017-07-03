package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.


*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        if (n1==n2&&n1==n3) {
            System.out.println(n1+" "+n2+" "+n3);
            }
            else if (n1 == n2) {
            System.out.println(n1+" "+n2);
        }
        else if (n1==n3) {
            System.out.println(n1+" "+n3);
        }
        else if (n2==n3) {
            System.out.println(n2+" "+n3);
        }
    }
}