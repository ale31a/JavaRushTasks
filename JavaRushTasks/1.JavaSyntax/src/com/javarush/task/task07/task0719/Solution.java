package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Требования:
1. Объяви переменную типа список целых чисел и сразу проинициализируй ee.
2. Считай 10 целых чисел с клавиатуры и добавь их в список.
3. Выведи числа в обратном порядке.
4. Используй цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {list.add(Integer.parseInt(reader.readLine()));}
        //напишите тут ваш код
        for (int i = list.size()-1; i+1>0  ; i--) System.out.println(list.get(i));
    }
}