package com.javarush.task.task04.task0412;

/*
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int sn = Integer.parseInt(s);
        if (sn>0) {
            sn=sn*2;
            System.out.println(sn);
        } else if (sn<0) {sn++;
            System.out.println(sn);

        }
        else System.out.println("0");
        //напишите тут ваш код

    }

}