package ru.javabegin.training.fastjava2.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_85 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите х:");
        String xS = br.readLine();
        int x = Integer.parseInt(xS);
        if (x < -1) {
            System.out.println("Y равен " + -1);
        } else if (x > -1) {
            System.out.println("Y равен " + x);
        } else if (x == -1) {
            System.out.println("Y равен " + 1);
        }
    }
}
