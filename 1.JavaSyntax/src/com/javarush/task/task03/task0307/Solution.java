package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //Создать 10 зергов, 5 протоссов и 12 терран.
        Zerg [] zerg = new Zerg [10];
        for (int i =0 ; i < zerg.length ; i ++){
            zerg [i] = new Zerg ();
            zerg [i].name = "Alien"+ i ;
            System.out.println (zerg [i].name);
        }
        Protoss [] protoss = new Protoss[5];
        for (int i = 0 ; i < protoss.length; i ++){
            protoss[i] = new Protoss ();
            protoss[i].name = "Zilot"+i+"man";
            System.out.println(protoss[i].name);
        }
        Terran [] terrans = new Terran[12];
        int x = 0 ;
        while (x < terrans.length){
            terrans[x] = new Terran ();
            terrans [x].name = "Marin"+x+"Opng";
            x = x + 1 ;
        }
    }
    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
