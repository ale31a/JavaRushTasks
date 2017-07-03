package com.javarush.task.task05.task0501;

/* 
Создание кота
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat {
    String name;
    int age;
    int weight;
    int strength;


    public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.age = 12;
    cat1.name = "asd";
    cat1.weight = 12;
    cat1.strength = 22;

    }
}
