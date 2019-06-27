package ru.javabegin.training.fastjava2.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число a:");
        String aS = br.readLine();
        int a = Integer.parseInt(aS);
        System.out.println("Введите число b:");
        String bS = br.readLine();
        int b = Integer.parseInt(bS);
        if (b % a == 0) {
            System.out.println("Число а является делителем b");
        } else {
            System.out.println("Число а не является делителем b");
        }
    }
}
