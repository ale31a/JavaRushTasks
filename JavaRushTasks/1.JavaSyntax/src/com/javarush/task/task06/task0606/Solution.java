package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: «Even: а Odd: b», где а — количество четных цифр, b — количество нечетных цифр.

1 ввод числа
2 колличество знаков в числе, переведем в строку, посчитаем колличество знаков
3 узнаем четность каждого знака


*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();// ввод числа
        int n = Integer.parseInt(s);//перевод в цифровую плоскость
//        int nznakov = s.length(); // колличество знаков
//
//        int i;
//        for (i = nznakov;; i--) {
//            int i1 = ((n / (Math.pow(10, i))) % 2) == 0 ? even++ : odd++;
//        if (i==0) {break;}
//        }
        for (int i = 0; n != 0; i++) {
            if (n % 2 == 0) {
                even++;
            } else odd++;
            n /= 10;
        }
        System.out.println("Even: "+even+" Odd: "+odd);

    }
}

