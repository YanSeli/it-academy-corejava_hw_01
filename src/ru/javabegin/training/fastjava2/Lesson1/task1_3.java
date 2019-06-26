package ru.javabegin.training.fastjava2.Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task1_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sI = br.readLine();
        int i = Integer.parseInt(sI);
        System.out.println("Вы ввели число: "+i);
    }
}