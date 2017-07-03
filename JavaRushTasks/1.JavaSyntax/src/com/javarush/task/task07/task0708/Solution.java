package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
Требования:
1. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList < String > sp = new ArrayList < String > ();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for(int i = 0; i <5;i++){
            sp.add(reader.readLine());
            if (sp.get(i).length()>max)
                max = sp.get(i).length();
        }
        for(int i =0;i<5;i++)
        {
            if (max==sp.get(i).length())
                System.out.println(sp.get(i));
        }
    }
}
