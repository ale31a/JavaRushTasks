package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
Создать класс Dog (собака) с тремя конструкторами:
— Имя
— Имя, рост
— Имя, рост, цвет
Требования:
1. У класса Dog должна быть переменная name с типом String.
2. У класса Dog должна быть переменная height с типом int.
3. У класса Dog должна быть переменная color с типом String.
*/


public class Dog {
    private String name = null;
    private int height = 20;
    private String color = "red";

    public Dog (String name) { this.name = name;}
    public Dog( String name, int height) {this.name = name; this.height = height;}
    public Dog ( String name, int height, String color) {this.name = name; this.height = height; this.color =color;}


    public static void main(String[] args) {

    }
}
