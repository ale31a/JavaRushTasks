package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Метод doubleValues должен удваивать элементы списка по принципу a,b,c -> a,a,b,b,c,c..
4. Выведи получившийся список на экран, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList <String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) list.add(reader.readLine());
        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        for (int i = 0; i < result.size(); i++) System.out.println(result.get(i));}

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i <list.size() ; i++) {
            list.add(i,list.get(i++));}
        return list;
    }
}
