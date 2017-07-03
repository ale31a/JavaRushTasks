package com.javarush.task.task07.task0724;

/* 
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни
 их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
        Human father1 = new Human("Антон", true, 56);
        Human mother1 = new Human("Иллона", false, 54);
        Human father2 = new Human("Костя", false, 65);
        Human mother2 = new Human("Юля", false, 60);
        Human ch1 = new Human("Женя", true, 21, father1, mother1);
        Human ch2 = new Human("Коля", true, 11, father1, mother1);
        Human ch3 = new Human("Оля", false, 14, father2, mother2);
        Human ch4 = new Human("Галя", false, 16, father2, mother2);
        Human ch5 = new Human("Петя", true, 25, father1, mother1);
        System.out.println(father1.toString());
        System.out.println(mother1.toString());
        System.out.println(father2.toString());
        System.out.println(mother2.toString());
//        Дети с родителями
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
        System.out.println(ch4.toString());
        System.out.println(ch5.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age=age;
            this.father = father;
            this.mother=mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















