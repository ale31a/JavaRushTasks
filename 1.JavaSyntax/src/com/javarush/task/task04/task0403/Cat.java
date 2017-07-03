package com.javarush.task.task04.task0403;

/* 
Реализовать метод setName
*/

public class Cat {
    private String name;


    public void setName(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
Cat cat1 = new Cat();
cat1.setName("sras");
Cat cat2 = new Cat();
cat2.setName("rrrrr");
    }
}
