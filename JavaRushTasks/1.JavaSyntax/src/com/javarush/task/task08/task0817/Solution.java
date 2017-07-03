package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
    Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
    Удалить людей, имеющих одинаковые имена.
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        Map <String, String> map = new HashMap<>();
        for (int i = 0; i < 10 ; i++) {
            map.put("Stepanov"+i,imia(i));
        } return (HashMap<String, String>) (HashMap<String, String>) map;
    }

    private static String imia(int i) {
        if (i%2==0){return "olga";} else
            if (i%3 == 0) {
            return "renat";} else return "abi-kto";}

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap temp = new HashMap<>(map);
        for (String s: new HashSet<>(map.values())){
            int count=0;
            for (String name: map.values()) if (name.equals(s)) count++;
            if (count>1) removeItemFromMapByValue(map,s);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String,String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}
