package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int m = 1;
        for (int i = 1; i <11;i++ ) {
            for (int j = 1; j <= m; j++) {
                System.out.print("8");
                }
                m++;
            System.out.println();
        }

    }
}
