package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод fix должен удалять из списка строк все слова, содержащие букву «р». Исключение: слова содержащие и букву «р» и букву «л» - их нужно оставить.
3. Метод fix должен удваивать слова, содержащие букву «л» (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву «л» и букву «р» - их не нужно удваивать.
4. Метод fix не должен ничего делать со словами, содержащими и букву «л» и букву «р».
5. Метод fix не должен ничего делать со словами, которые не содержат ни букву «л», ни букву «р».
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i).contains("р")&list.get(i).contains("л")) continue;
            if (list.get(i).contains("л")) list.add(0,list.get(i++));
            if (list.get(i).contains("р")) {
                list.remove(i);
                i--;
        }
        }
        return list;
    }
}