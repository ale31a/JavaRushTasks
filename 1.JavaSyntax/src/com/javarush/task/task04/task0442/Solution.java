package com.javarush.task.task04.task0442;


/* 
Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int k=0;
        for (int i=0;; i++) {
            k = Integer.parseInt(reader.readLine());
            sum=sum+k;
            if (k==-1) break;
        }
        System.out.print(sum);

    }
}
