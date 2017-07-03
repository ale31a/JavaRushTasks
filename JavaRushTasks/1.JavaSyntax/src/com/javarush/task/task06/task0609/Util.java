package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import static java.lang.StrictMath.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double deltaX=x2-x1;
        double deltaY=y2-y1;
      return   Math.sqrt(deltaX*deltaX+deltaY*deltaY);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,2,3,4));
    }
}
