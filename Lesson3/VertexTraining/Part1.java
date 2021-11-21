package Lesson3.VertexTraining;
//https://vertex-academy.com/tutorials/ru/zadachi-na-cikly-v-java/?doing_wp_cron=1613999745.4719541072845458984375
//https://vertex-academy.com/tutorials/ru/zadachi-na-cikl/?doing_wp_cron=1613999947.4764170646667480468750

import java.util.Scanner;

public class Part1 {
//Task 1,2.
    public static void main(String[] args) {
        System.out.println("Задача №1");
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }

//Task 3.
        System.out.println();
        System.out.println("-----------");
        System.out.println("Задача №3");
        int a = 3;
        for (int i = 1; i < 11; i++) {
            System.out.println("3 * " + i + " = " + a * i);
        }

//Task 4.
        System.out.println("-----------");
        System.out.println("Задача №4");
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Введите целое число:");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
