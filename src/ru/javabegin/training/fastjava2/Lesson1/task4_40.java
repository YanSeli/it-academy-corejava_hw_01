package ru.javabegin.training.fastjava2.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_40 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число x: ");
        String xS = br.readLine();
        double x = Double.parseDouble(xS);
        if (x<=5.7 && x>=2.4){
            System.out.println("f(x) равно "+(x*x));
        }else{
            System.out.println("f(x) равно "+4);
        }
    }
}
