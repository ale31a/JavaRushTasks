package com.javarush.task.task04.task0430;

/* 
От 1 до 10
Требования:
1. Программа не должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Каждое значение должно быть выведено с новой строки.
4. Программа должна выводить числа от 1 до 10.
5. В программе должен использоваться цикл while.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1;
        while (i <11) {
            System.out.println(i);
            i++;
        }

    }
}