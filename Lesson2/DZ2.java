package Lesson2;

import java.util.Scanner;

public class DZ2 {

    //Task 1.
    public static class Task1 {
        public static void main(String[] args) {
            int[] mass = {1, 0, 1, 1, 0, 0, 0, 0, 1};
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] == 1) {
                    mass[i] = 0;
                } else {
                    mass[i] = 1;
                }
                System.out.print(mass[i] + " ");
            }
        }
    }

    //Task 2.
    public static class Task2 {
        public static void main(String[] args) {
            int size = 8;
            int a = 0;
            int[] mass = new int[size];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = a;
                System.out.print(mass[i] + " ");
                a += 3;
            }
        }
    }

    //Task 3.
    public static class Task3 {
        public static void main(String[] args) {
            int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] < 6) {
                    mass[i] *= 2;
                }
                System.out.print(mass[i] + " ");
            }
        }
    }

    //Task 4. МОЁ РЕШЕНИЕ.
    public static class Task4_1 {
        public static void main(String[] args) {
            int a = 20;
            int b = 15;
            int[][] mass = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = b - i - 1; j > b - i - 2; j--) {
                    mass[i][i] = 1;
                    mass[i][j] = 1;
                }
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(mass[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    //Task 4. РЕШЕНИЕ ПРЕПОДАВАТЕЛЯ С МОИМИ МОДИФИКАЦИЯМИ.
    public static class Task4_2 {
        public static void main(String[] args) {
            int side_line = 15;
            int side_column = 20;
            int one = 2;
            int two = 4;
            int[][] mass = new int[side_line][side_column];
            fillField(mass, side_line, side_column, one, two);
            printField(mass, side_line, side_column);
        }

        public static void fillField(int[][] mass, int side_line, int side_column, int a, int b) {
            for (side_line = 0, side_column = mass.length - 1; side_line < mass.length; side_line++, side_column--) {
                mass[side_line][side_line] = a;
                mass[side_line][side_column] = b;
            }
        }

        public static void printField(int mass[][], int side_line, int side_column) {
            for (int i = 0; i < side_column; i++) {
                for (int j = 0; j < side_line; j++) {
                    System.out.print(mass[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    //Task 5.
    public static class Task5 {
        public static void main(String[] args) {
            int[] mass1 = {1, 21, 3, 6, 11, 4, 5, 3, 4, 8, 9, 20};
            int[] mass2 = {1, 5, 0};
//            System.out.println(mass.length);
//            for (int i = 0; i < mass.length - 1; i++) {
//                if (mass[i + 1] > max) {
//                    max = mass[i + 1];
//                }
//                if (mass[i + 1] < min) {
//                    min = mass[i + 1];
//                }
//        }
            System.out.println("Максимальное значение = " + findMax(mass1));
            System.out.println("Минимальное значение = " + findMin(mass1));
            System.out.println("Максимальное значение = " + findMax(mass2));
            System.out.println("Минимальное значение = " + findMin(mass2));
        }

        public static int findMax(int[] mass) {
            int max = mass[0];
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i + 1] > max) {
                    max = mass[i + 1];
                }
            }
            return max;
        }

        public static int findMin(int mass[]) {
            int min = mass[0];
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i + 1] < min) {
                    min = mass[i + 1];
                }
            }
            return min;
        }
    }

    //Task 6.
    public static class Task6 {
        public static void main(String[] args) {
            int sum_mass = 0;
            int sum = 0;
            int[] mass1 = {0, 0, 0};
            int[] mass2 = {1, 2, 1, 1, 2, 1, 2, 10};
            int[] mass3 = {1, 2, 1, 1, 2, 1, 2, 80, 90};
            for (int i = 0; i < mass1.length; i++) {
                sum_mass += mass1[i];
            }
            for (int i = 0; i < mass1.length; i++) {
                sum += mass1[i];
            }
            System.out.println(sum_mass);
            System.out.println(sum);
            System.out.println("МОЙ КОД");
            System.out.println(checkBalance(mass1));
            System.out.println(checkBalance(mass2));
            System.out.println(checkBalance(mass3));
            System.out.println("ГОТОВОЕ ДЗ");
            System.out.println(checkBalance2(mass1));
            System.out.println(checkBalance2(mass2));
            System.out.println(checkBalance2(mass3));
        }

        public static boolean checkBalance(int mass[]) {
            boolean truee = false;
            int sum_mass = 0;
            int sum = 0;
            for (int i = 0; i < mass.length; i++) {
                sum_mass += mass[i];
            }
            for (int i = 0; i < mass.length; i++) {
                sum += mass[i];
                if (sum == sum_mass - sum) {
                    truee = true;
                }
            }
            if (sum_mass == 0) {
                truee = false;
            }
            return truee;
        }

        private static boolean checkBalance2(int[] mass) {
            int right = 0;
            int left = 0;
            for (int i = 0; i < mass.length - 1; i++) {
                left += mass[i];
                for (int j = i + 1; j < mass.length; j++) {
                    right += mass[j];
                }
                if (left == right) {
                    return true;
                }
                right = 0;
            }
            return false;
        }
    }

    //Task 7.
    public static class Task7 {
        public static void main(String[] args) {
            int[] mass = {1, 2, 3, 4, 5};
            changePlacePos(mass, 6);
            for (int i = 0; i < mass.length; i++) {
                System.out.print(mass[i] + " ");
            }
        }

        public static int[] changePlacePos(int[] mass, int n) {
            int container = 0;
            if (n >= 0) {
                for (int i = 0; i < n; i++) {
                    container = mass[0];
                    for (int j = 0; j < mass.length - 1; j++) {
                        mass[j] = mass[j + 1];
                    }
                    mass[mass.length - 1] = container;
                }
            } else {
                for (int i = 0; i < n * (-1); i++) {
                    container = mass[mass.length - 1];
                    for (int j = mass.length - 1; j > 0; j--) {
                        mass[j] = mass[j - 1];
                    }
                    mass[0] = container;
                }
            }
            return mass;
        }
    }

    //Task 8.
    //ЦЕЛЬСИИ И ФАРЕНГЕЙТЫ
    public static class Task8 {
        public static void main(String[] args) {
            float[] fahrenheit = {0, 248, 310, 223, 469, 58, 375, 385, 234, 144, 454, 454, 243, 569, 306, 405, 492, 587, 282, 452, 145, 589, 260, 591, 171, 181, 96, 254, 440, 419, 81, 310, 67, 359, 502, 504, 385, 277, 288};
//            float[] fahrenheit = {248f, 310f, 223f};
            int quantity = fahrenheit.length;
            for (int i = 0; i < quantity; i++) {
                System.out.printf("%.0f", fahrenheit[i]);
                System.out.print(" ");
            }
            System.out.println();
            Celsius(fahrenheit, quantity);
            for (int i = 0; i < quantity; i++) {
                System.out.printf("%.0f", fahrenheit[i]);
                System.out.print(" ");
            }
        }

        public static float[] Celsius(float[] mass, int quantity) {
            for (int i = 0; i < quantity; i++) {
                mass[i] = (mass[i] - 32) / 180 * 100;
            }
            return mass;
        }
    }

    //Task 8.
    //ЦЕЛЬСИИ И ФАРЕНГЕЙТЫ. ВАРИАНТ ПРЕПОДАВАТЕЛЯ.
    public static class MainClassDopDZ {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах по фарингейту: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println("Температура в цельсиях: " + getCelsius(fahrenheit));

//            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество преобразуемых значений температур: ");
            int n = scanner.nextInt(); //число значений температур для преобразования
            printMassTemp(n);

        }

        public static double getCelsius(double fahrenheit){
            return (fahrenheit - 32) / ((212  - 32) / 100.0); //Преобразование из шкалы фарингейта в цкалу цельсия
        }

        public static void printMassTemp(int n){

            Scanner scanner = new Scanner(System.in);
            double[] massTemp = new double[n]; //Массив вводимых значений

            System.out.println("Введите температуру в градусах по фарингейту: ");

            //---Ввод преобразуемых значений температуры
            for (int i = 0; i < n; i++){
                System.out.println("Введите значение температуры номер "+ (i+1) +":");
                massTemp[i] = scanner.nextDouble();
            }
            //---

            //---Преобразование и вывод значений температуры
            for (int i = 0; i < massTemp.length; i++) {
                System.out.println("Для значения: " + massTemp[i] + " температура по цельсию = " + getCelsius(massTemp[i]));
            }
            //---
        }
    }
}

