package ru.javabegin.training.fastjava2.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Обьявление переменных
        String aS = br.readLine();
        int a = Integer.parseInt(aS);
        String bS = br.readLine();
        int b = Integer.parseInt(bS);
        String cS = br.readLine();
        int c = Integer.parseInt(cS);
        String xS = br.readLine();
        int x = Integer.parseInt(xS);
        String nS = br.readLine();
        int n = Integer.parseInt(nS);
        String mS = br.readLine();
        int m = Integer.parseInt(mS);
        //Выражения:
        //Вариант а)
        double q = -1 / (Math.pow(x, 2));
        //Вариант б)
        double w = a / (b * c);
        //Вариант в)
        double e = (a / b) * c;
        //Вариант г)
        double r = (a + b) / 2;
        //Вариант д
        double t = 5.45 * ((a + 2 * b) / (2 - a));
        //Вариант е
        double y = -b - (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)));//корень верхней части
        double u = y / (2 * a);
        //Вариант ж)
        double i = (-b + (1 / a)) / (2 / c);
        //Вариант з)
        double o = 1 / (1 + ((a + b) / 2));
        //Вариант и)
        double p = (1 / (1 + (1 / (2 + (1 / (2 + (3 / 5)))))));
        //Вариант к)
        double s = Math.pow(m, n);
        double d = Math.pow(2, s);
    }
}
