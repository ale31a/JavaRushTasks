package com.javarush.task.task04.task0423;

/*



Если возраст больше 20 вывести сообщение "И 18-ти достаточно".

Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String name = reader.readLine();
       int year = Integer.parseInt(reader.readLine());
       if (year>20) System.out.print("И 18-ти достаточно");
    }
}
