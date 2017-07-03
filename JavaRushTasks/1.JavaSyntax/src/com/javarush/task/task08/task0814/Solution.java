package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
5. Метод removeAllNumbersMoreThan10() должен удалять из множества все числа больше 10.
*/


public class Solution {
    public static HashSet<Integer> createSet() {

        HashSet<Integer> set = new HashSet<>();

        set.add(1);//1
        set.add(2);//2
        set.add(3);//3
        set.add(4);//4
        set.add(15);//5
        set.add(13);//6
        set.add(111);//7
        set.add(132);//8
        set.add(142);//9
        set.add(122);//10
        set.add(102);//11
        set.add(192);//12
        set.add(172);//13
        set.add(22);//14
        set.add(3132);//15
        set.add(1132); //16
        set.add(5132);//17
        set.add(13332);//18
        set.add(11132);//19
        set.add(12232);//20

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            int num = iterator.next();
            if (num > 10)
                iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
