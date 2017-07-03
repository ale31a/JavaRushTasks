package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет, (имя, адрес и возраст – неизвестные. Кот — бездомный)
— вес, цвет, адрес (чужой домашний кот)
Задача конструктора – сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
Требования:
1. У класса Cat должна быть переменная name с типом String.
2. У класса Cat должна быть переменная age с типом int.
3. У класса Cat должна быть переменная weight с типом int.
4. У класса Cat должна быть переменная address с типом String.
5. У класса Cat должна быть переменная color с типом String.
*/
public class Cat {
   private String name = null;
   private int age = 1;
   private int weight = 3;
   private String address = null;
   private String color = "red";
   public Cat (String name) {this.name = name;}
   public Cat (String name, int weight, int age) {
       this.name = name;
       this.weight = weight;
       this.age = age;}
    public Cat (String name, int age) {
       this.name = name;
       this.age = age;}
    public Cat (int weight, String color) {
       this.weight = weight;
       this.color = color;}
    public Cat (int weight, String color, String address) {
       this.weight = weight;
       this.color = color;
       this.address = address;}


    public static void main(String[] args) {

    }
}
