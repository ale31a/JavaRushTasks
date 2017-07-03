package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i, j, a = 0;

        for (i = 1; i <=10; i++) {
            for (j = 1; j <=10; j++) {
                a = i * j;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
