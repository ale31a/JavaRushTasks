package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
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
//4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящихиз 10 записей.
    HashMap<String,String> hashMap = new HashMap<>(10);
        hashMap.put("1", "hiter");
        hashMap.put("2", "hiter111");
        hashMap.put("3", "hiter1");
        hashMap.put("4", "hiter1");
        hashMap.put("5", "hiter2");
        hashMap.put("6", "hiter2");
        hashMap.put("7", "hiter2");
        hashMap.put("8", "hiter3");
        hashMap.put("9", "hiter3");
        hashMap.put("10", "hiter3");
        return hashMap;}

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
//Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
        HashMap <String,String> map1 = new HashMap<>(map);
        for (Map.Entry<String,String> pair: map1.entrySet()){
            int i = 0;
            for (Map.Entry<String,String> pair2: map1.entrySet()){
                if (pair2.getValue().equals(pair.getValue())) i++;
                if (i>1) removeItemFromMapByValue(map, pair.getValue());
            }
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
//    HashMap <String, String> map = createMap();
//        System.out.println(map);
//        removeTheFirstNameDuplicates(map);
//        System.out.println(map);
    }
}
