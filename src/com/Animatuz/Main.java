package com.Animatuz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int rhombusHeight = readHeight();

        printRhombus(rhombusHeight);

    }

    static int readHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение высоты рисунка ромба. Оно должно быть целым числом, быть более или равно 1, нечётным: ");
        int height = scanner.nextInt();
        if ((height % 2) != 1) {
            System.out.println("Ошибка! Значение высоты рисунка ромба должно быть целым числом, быть более или равно 1, нечётным.");
        }
        return height;
    }

    static void printRhombus(int rhombusHeight) {
        int quarter = 1;
        int secondQuarter = 0;
        String space = " ";
        String star = "*";
        int indent = (rhombusHeight - 1) / 2;
        while (quarter != ((rhombusHeight - 1) / 2) + 1) {
            System.out.print(space.repeat(indent));
            System.out.println(star.repeat(quarter + secondQuarter));
            indent--;
            secondQuarter++;
            quarter++;
        }
        while (quarter != 0) {
            System.out.print(space.repeat(indent));
            System.out.println(star.repeat(quarter + secondQuarter));
            indent++;
            quarter--;
            secondQuarter--;
        }
    }
}
