package ru.javabegin.training.fastjava2.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число x:");
        String xS = br.readLine();
        double x = Integer.parseInt(xS);
        double y;
        //Вариант а)
        if (x == 0) {
            y = 0;
            System.out.println("Координаты: x- " + x + " y- " + y);
        } else if (x > 0 && x <= 2) {
            y = x;
            System.out.println("Координаты: x- " + x + " y- " + y);
        } else if (x > 2) {
            y = 2;
            System.out.println("Координаты: x- " + x + " y- " + y);
        } else if (x < 0) {
            System.out.println("x не соответствует условию");
        }
    }
    //Вариант б)
        /*if (x == 0) {
            y = 0;
            System.out.println("Координаты: x- "+x+" y- "+y);
        } else if (x > 0 && x <= 3) {
            y = x - (x + x);
            System.out.println("Координаты: x- "+x+" y- "+y);
        } else if (x > 3) {
            y = -3;
            System.out.println("Координаты: x- "+x+" y- "+y);
        }else if (x < 0) {
            System.out.println("x не соответствует условию");
            */
}
