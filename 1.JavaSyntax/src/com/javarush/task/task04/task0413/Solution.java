package com.javarush.task.task04.task0413;

/* 
День недели «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        if (a<1 || a>7) {System.out.println("такого дня недели не существует");
        } else nedelia(a);

        //напишите тут ваш код
    }

    private static void nedelia(int a) {
        switch (a) {
            case 1: System.out.println("понедельник");
            break;
            case 2: System.out.println("вторник");
                break;
            case 3: System.out.println("среда");
                break;
            case 4: System.out.println("четверг");
                break;
            case 5: System.out.println("пятница");
                break;
            case 6: System.out.println("суббота");
                break;
            case 7: System.out.println("воскресенье");
                break;



        }
    }
}