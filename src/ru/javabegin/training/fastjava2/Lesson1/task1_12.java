package ru.javabegin.training.fastjava2.Lesson1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class task1_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("5 10");
        System.out.println("7 см");


        String vT = br.readLine();
        int t = Integer.parseInt(vT);

        String vS = br.readLine();
        int v = Integer.parseInt(vS);

        System.out.println(100 + " " + t);
        System.out.println(1949 + " " + v);

        String xS = br.readLine();
        int x = Integer.parseInt(xS);

        String yS = br.readLine();
        int y = Integer.parseInt(yS);

        System.out.println(x + " " + y);
        System.out.println(5+ " " + y);


    }
}
