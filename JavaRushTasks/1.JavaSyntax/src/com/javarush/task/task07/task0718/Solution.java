package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран номер первого элемента, нарушающего
 такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> ls = new ArrayList<>();
        for (int i = 0; i < 10; i++) ls.add(reader.readLine());
        int s = 0;
        for (int i = 0; i <ls.size() ; i++) {
            if (ls.get(i).length()> s) {s = ls.get(i).length();}
            else {
                System.out.println(i);
            break;}
        }
    }
}

