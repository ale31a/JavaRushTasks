package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String vivod;
        if (n==0) { System.out.print("ноль");}
            else System.out.print( metZnak(n) + " " + metChetnost(n));}
    private static String metChetnost(int a) {
        if (a%2==0) return "четное число";
                else return "нечетное число";
    }
    private static String metZnak(int a) {
        if (a<0) return  "отрицательное";
        else return  "положительное";
    }
}
