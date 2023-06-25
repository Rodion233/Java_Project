package org.example.seminar1.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Введите количество ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("zadanie2(n, scanner) = " + zadanie2(n, scanner));

    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует
     * отрицательное число.
     * @param n int
     * @param scanner scaner
     * @return count
     */
    private static int zadanie2(int n, Scanner scanner) {
        int count = 0;
        int a = 0, b = 0;
        System.out.println("Введите число");
        a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) count++;
            a = b;
        }
        return count;
    }

}
