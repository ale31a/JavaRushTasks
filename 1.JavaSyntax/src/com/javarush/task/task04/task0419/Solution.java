package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
int[] cats = new int[6]; // массив из шести элементов с начальным значением 0 для каждого элемента
cats[3] = 5; // четвертому элементу присвоено значение 5
cats[5] = 7; // шестому элементу присвоено значение 7

Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());

        System.out.print(sravnenie(sravnenie(n1,n2),sravnenie(n3,n4)));
        }

    private static int sravnenie(int a, int b) {
        int c=0;
        if (a>=b) {
            c=a;
        } else c=b;
        return c;
    }


}
