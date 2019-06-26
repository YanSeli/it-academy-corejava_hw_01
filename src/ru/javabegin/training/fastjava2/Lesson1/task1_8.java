package ru.javabegin.training.fastjava2.Lesson1;

import java.util.Random;

public class task1_8 {
    public static void main(String[] args){
        Random rand =new Random();
        int e = rand.nextInt(100);
        int f = rand.nextInt(100);
        int g = rand.nextInt(100);
        int h = rand.nextInt(100);

        System.out.println(e+" "+f+" "+g+" "+h);
    }
}
