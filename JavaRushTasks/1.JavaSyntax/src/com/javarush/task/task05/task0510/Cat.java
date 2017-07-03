package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
Создать класс Cat (кот) с пятью инициализаторами:
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
— вес, цвет, адрес (чужой домашний кот)

Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста.
А вот имени может и не быть (null).
То же касается адреса: null.
Программа не должна считывать данные с клавиатуры.
2. У класса Cat должна быть переменная name с типом String.
3. У класса Cat должна быть переменная age с типом int.
4. У класса Cat должна быть переменная weight с типом int.
5. У класса Cat должна быть переменная address с типом String.
6. У класса Cat должна быть переменная color с типом String.
*/

public class Cat {
    private  String name;//2. У класса Cat должна быть переменная name с типом String.
    private int age;//3. У класса Cat должна быть переменная age с типом int.
    private int weight;//4. У класса Cat должна быть переменная weight с типом int.
    private String address;//5. У класса Cat должна быть переменная address с типом String.
    private String color;//6. У класса Cat должна быть переменная color с типом String.

    public  void initialize (String name) {//— Имя,
        this.name = name;
        this.age = 3;
        this.color = "red";
        this.weight = 4;
        this.address = null;
    }
    public void initialize (String name,int weight, int age) {//— Имя, вес, возраст
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address=null;
        this.color = "red";
    }
    public void initialize (String name,  int age) { //— Имя, возраст (вес стандартный)
    this.name=name;
    this.age=age;
        this.weight = 4;
        this.address = null;
        this.color = "red";
    }
    //— вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
    public void initialize (int weight,String color) {
        this.name=null;
        this.age = 3;
        this.color=color;
        this.weight = weight;
        this.address = null;
    }
    //— вес, цвет, адрес (чужой домашний кот)
    public void initialize (int weight,String color, String address){
        this.weight=weight;
        this.color=color;
        this.address=address;
        this.name=null;
        this.age = 3;
    }

    public static void main(String[] args) {

    }
}
