package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
Работа светофора для пешеходов запрограммирована следующим образом:


в начале каждого часа в течение трех минут горит зелёный сигнал,


затем в течение одной минуты — желтый,

а потом в течение одной минуты — красный,


затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
«зелёный» — если горит зелёный цвет,
«желтый» — если горит желтый цвет,
«красный» — если горит красный цвет.


*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ts = reader.readLine();
        Double t = Double.parseDouble(ts);
        double ostatok = t%5;
        if (ostatok<3) {
            System.out.println("зелёный");
        }
        else if (ostatok<4) {
            System.out.println("желтый");
        } else { System.out.println("красный");

        }

    }
}