package ru.javabegin.training.fastjava2.Lesson1;

public class task1_60 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d, e;
        //Вариант а)
        d = b;
        e = a;
        b = c;
        a = d;
        c = e;

        //Вариант б)
        d = b;
        e = c;
        b = a;
        c = d;
        a = e;
    }
}
