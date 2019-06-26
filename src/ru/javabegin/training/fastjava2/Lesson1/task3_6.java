package ru.javabegin.training.fastjava2.Lesson1;

public class task3_6 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean z = true;

        //Вариант а)
        boolean a = (x || y && !z);
        //Вариаеннт б)
        boolean b = !x && !y;
        //Вариант в)
        boolean c = !(z && z) || y;
        //Вариант г)
        boolean d = x && !y || z;
        //Вариант д)
        boolean e = x && (!y || z);
        //Вариант е)
        boolean f = x || (!(y || z));
        System.out.println(f);
    }
}
