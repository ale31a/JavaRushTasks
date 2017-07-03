package com.javarush.task.task04.task0441;


/* 
Как-то средненько
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вивести любое из них.
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int min = Math.min(Math.min(n1,n2),n3);
        int max = Math.max(Math.max(n1,n2),n3);
        System.out.print(n1+n2+n3-max-min);

    }
}
