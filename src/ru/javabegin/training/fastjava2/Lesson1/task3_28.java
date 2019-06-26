package ru.javabegin.training.fastjava2.Lesson1;

public class task3_28 {
    public static void main(String[] args) {
        int a = 1;
        int b = 900;
        int c = 100;
        //Вариант а)
        if (a > 100 && b > 100) {
            boolean d = true;
        }
        //Вариант б)
        if ((a % 2 == 0) ^ (b % 2 == 0)) {
            boolean d = true;
        }
        //Вариант в)
        if (a>0 || b>0){
            boolean d = true;
        }
        //Вариант г)
        if (a%3==0 && b%3==0 && c%3==0){
            boolean d = true;
        }
        //Вариант д)
        if ((a < 50 && b >= 50 && c >= 50) || (b < 50 && a >= 50 && c >= 50) || (c < 50 && a >= 50 && b >= 50)){
            boolean d = true;
        }
        //Вариант е)
        if (a<0 || b<0 || c<0){
            boolean d = true;
        }
    }
}