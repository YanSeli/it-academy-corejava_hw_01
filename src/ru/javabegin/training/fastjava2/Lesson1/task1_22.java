package ru.javabegin.training.fastjava2.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1_22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String xS = br.readLine();
        int x = Integer.parseInt(xS);
        String aS = br.readLine();
        int a = Integer.parseInt(aS);
        //Вариант а)
        double y = (7 * (Math.pow(x, 2)) - (3 * x) + 6);
        //Вариант б)
        double z = ((12 * (Math.pow(a, 2))) + (7 * a) - 16);
    }
}
