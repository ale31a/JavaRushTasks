package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //«имя» захватит мир через «число» лет. Му-ха-ха!
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        String name = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.print(name+" захватит мир через "+nAge+" лет. Му-ха-ха!");
    }
}
