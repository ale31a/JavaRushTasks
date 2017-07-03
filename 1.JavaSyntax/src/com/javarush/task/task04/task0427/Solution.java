package com.javarush.task.task04.task0427;

/* 
Описываем числа
Ввести с клавиатуры целое число в диапазоне 1 — 999. Вывести его строку-описание следующего вида:
«четное однозначное число» — если число четное и имеет одну цифру,
«нечетное однозначное число» — если число нечетное и имеет одну цифру,
«четное двузначное число» — если число четное и имеет две цифры,
«нечетное двузначное число» — если число нечетное и имеет две цифры,
«четное трехзначное число» — если число четное и имеет три цифры,
«нечетное трехзначное число» — если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 — 999, в таком случае ничего не выводить на экран.
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n>0 && n<1000)
        System.out.print(chetnost(n) + " " + znak(n));}
    private static String znak(int n) {
        if (n==0) return "";
        if (n<10) return "однозначное число";
        else if (n<100) return "двузначное число";
            else if (n<1000) return "трехзначное число";
            else return "";}
    private static String chetnost(int n) {
        if (n==0 || n>999) return "";
        else if (n%2==0) return "четное";
        else return "нечетное";


    }
}
