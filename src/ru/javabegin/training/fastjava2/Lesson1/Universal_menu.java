package ru.javabegin.training.fastjava2.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Universal_menu {
    public static void menuChoice(int numMenu) {
        switch (numMenu) {
            case 1:
                System.out.println("Запускаю вариант а");
                break;
            case 2:
                System.out.println("Запускаю вариант б");
                break;
            case 3:
                System.out.println("Запускаю вариант г");
                break;
            case 4:
                System.out.println("Запускаю вариант д");
                break;
            case 5:
                System.out.println("Запускаю вариант ж");
                break;
            case 6:
                System.out.println("Запускаю вариант з");
                break;
            case 7:
                System.out.println("Запускаю вариант и");
                break;
            default:
                System.out.println("Такой вариант отсутсвует");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите вариант от 1 до 7. Для выхода нажмите 0");
        String s;
        int numMenu;
        for (; ; ) {
            s = br.readLine();
            numMenu = Integer.parseInt(s);
            if (numMenu == 0) {
                System.out.println("Выход");
                break;
            }
            menuChoice(numMenu);
        }
    }
}