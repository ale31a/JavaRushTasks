package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» — «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
5. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
6. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap <String,String> map = new HashMap<>(10);//«Фамилия» - «Имя».
//        map.put("Попов1","Александр");//1
//        map.put("Попа2","Алексей2");//2
//        map.put("Поповиченко3","Андрей3");//3
//        map.put("Попович4","Александ4р");//4
//        map.put("Пипа5","Амитист5");//5
//        map.put("Пайп6","Алкоголик6");//6
//        map.put("Питренко7","Аркадий7");//7
//        map.put("Папенко8","Алексаныдр8");//8
//        map.put("Пронин9","Артем9");//9
//        map.put("Папа10","Арканзас10");//10
        //key,value 4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов
        // String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
        for (int i = 0; i <10 ; i++) map.put("ass" + i, "sos" + i);
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //5. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
        int count=0;
        for (String value: map.values()) {
            if (value.equals(name)) count++;
        }
    return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
       int count = 0;
       for (String key:map.keySet()) {
           if (key.equals(lastName)) count++;
       }
        return count;
    }

    public static void main(String[] args) {
//        HashMap map =createMap();
//        System.out.println("дубль Имя - "+getCountTheSameFirstName(map,"Александр"));
//        System.out.println("дубль фамилия - "+getCountTheSameLastName(map,"Попов"));
    }
}
