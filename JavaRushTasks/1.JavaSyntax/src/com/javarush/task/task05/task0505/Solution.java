package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Cat v = new Cat("ass", 12,55,62);
        Cat ss = new Cat("ass1", 112,55,61);
        Cat ssas = new Cat("ass2", 12,555,60);
        System.out.println(v.fight(ss));
        System.out.println(  ss.fight(ssas));
        System.out.println( ssas.fight(ss));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
