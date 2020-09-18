package Zadanie1;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        four();
        five();
        six();
        seven();


    }

    static void four() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        sum = 0;
        int i = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;

        do {
            sum = sum + array[i];
            i++;
        }
        while (i < array.length);
        System.out.println(sum);
    }

    static void five() {
        for (int i = 1; i < 11; i++)
            System.out.println(1 + "/" + i);
    }

    static void six() {
        Random random = new Random();
        int[] mas = new int[random.nextInt(1000) + 100];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(1000) + 100;
        }
        for (int i = 0; i < mas.length; i++)
            System.out.println(mas[i]);
    }

    static void seven() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 1;
        for (int i = 2; i < n + 1; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}
