package ru.javabegin.training.fastjava2.Lesson1;

public class task4_104 {
    public static void main(String[] args) {
        int dayOfWeek = 1;
        switch (dayOfWeek){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
                default:
                    System.out.println("День недели не определен.");
        }
    }
}