package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
5. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>(10);
        hashMap.put("Иванов1", 100);
        hashMap.put("Иванов2", 200);
        hashMap.put("Иванов3", 300);
        hashMap.put("Иванов4", 400);
        hashMap.put("Иванов5", 500);
        hashMap.put("Иванов6", 600);
        hashMap.put("Иванов7", 700);
        hashMap.put("Иванов8", 800);
        hashMap.put("Иванов9", 900);
        hashMap.put("Иванов10", 1000);
        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
//       map.entrySet().removeIf(pair -> pair.getValue() < 500);
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if ((int)pair.getValue() < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
//    HashMap map = createMap();
//        System.out.println(map);
//        removeItemFromMap(map);
//        System.out.println(map);

    }
}