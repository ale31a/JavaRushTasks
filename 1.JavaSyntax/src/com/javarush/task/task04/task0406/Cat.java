package com.javarush.task.task04.task0406;

/* 
Реализовать метод setName
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        //напишите тут ваш код Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String fullName равное значению локальной переменной String fullName.
        this.fullName = fullName;
    }

    public static void main(String[] args) {

    }
}
