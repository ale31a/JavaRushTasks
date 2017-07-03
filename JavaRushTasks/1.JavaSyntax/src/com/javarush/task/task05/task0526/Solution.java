package com.javarush.task.task05.task0526;

/*
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате «name + » » + age + » « + address».
Требования:
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Serega",12,"Moscow never slip");
        Man man2 = new Man("Sega",13,"Moscow never slip1");
        Woman woman1= new Woman("olha",11,"Moscow never slip21");
        Woman woman2= new Woman("Hachiha",21,"Moscow never slip221");
        //5. Объекты выведи на экран в таком формате «name + » » + age + » « + address».
        PrintMan(man1);
        PrintMan(man2);
        PrintWoman(woman1);
        PrintWoman(woman2);
}

    private static void PrintMan(Man man1) {
        System.out.println(man1.name + " " + man1.age + " " + man1.address );
    }
    private static void PrintWoman(Woman woman1) {
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address );
    }

    //напишите тут ваш код

    public static class Man {
        String name, address;
        int age;

        public  Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address=address;
        }
    }

    public static class Woman {
        String name, address;
        int age;

        public  Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address=address;
        }
    }
}
