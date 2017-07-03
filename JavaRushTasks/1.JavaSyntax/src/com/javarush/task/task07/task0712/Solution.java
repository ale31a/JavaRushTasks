package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> s = new ArrayList();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int ns = Integer.MAX_VALUE;
        int nb = Integer.MIN_VALUE;
        int ks = 0;
        int kb = 0;
        for (int i = 0; i < 10; i++) {
            s.add(r.readLine());
            if (s.get(i).length() < ns) {
                ks = i;
                ns = s.get(i).length();
            }
            if (s.get(i).length() > nb) {
                kb = i;
                nb = s.get(i).length();
            }
        }
        if (ks < kb)
            System.out.println(s.get(ks));
        else
            System.out.println(s.get(kb));
    }
}
