package com.javarush.task.task03.task0309;

/*
1
1+2=3
1+2+3=6
1+2+3+4=10
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int result = 0;
        for (int i=0; i < 10; i++
             ) {result = result + i + 1;
             System.out.println(result);

        }
    }
}
