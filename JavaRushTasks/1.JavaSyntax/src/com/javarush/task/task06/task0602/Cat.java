package com.javarush.task.task06.task0602;

/* 
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
Требования:
1. В классе Cat должен быть void метод finalize.
2. В классе Dog должен быть void метод finalize.
3. Метод finalize класса Cat должен выводить на экран "Cat was destroyed".
4. Метод finalize класса Dog должен выводить на экран "Dog was destroyed".
*/

public class Cat {
    public static void main(String[] args) throws Throwable {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.finalize();
        dog.finalize();
}
protected void finalize () throws Throwable{
        System.out.println("Cat was destroyed");
}
}
class Dog {
    protected void finalize  ()throws Throwable{
        System.out.println("Dog was destroyed");
}


}
