package ru.javabegin.training.fastjava2.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1_25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sideSquare = Integer.parseInt(s);
        int perSq = sideSquare * sideSquare;
    }
}
