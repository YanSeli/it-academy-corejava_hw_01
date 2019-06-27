package ru.javabegin.training.fastjava2.Lesson1;

public class task4_1 {
    public static void main(String[] args) {
        double degrees = -4;
        double x = Math.toRadians(degrees);


        if (x > 0) {
            double y = (Math.sin(x)) * (Math.sin(x));
            System.out.println(y);
        } else {
            double y = (1 - (2 * Math.sin(x * x)));
            System.out.println(y);
        }

    }
}
