package Lesson3;

import java.util.Scanner;

public class DopDZSpiral {
    public static void main(String[] args) {
        String msg_width = "Enter the width of the matrix from 3 to 20:";
        String msg_height = "Enter the height of the matrix from 3 to 20:";
        String msg_start_value = "Enter Initial Value:";
        fillInSpiral(getParametersFromSc(msg_width), getParametersFromSc(msg_height), getInitialValueFromSc(msg_start_value));
    }

    public static int getParametersFromSc(String msg) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        while (a < 3 | a > 20) {
            System.out.println(msg);
            a = scanner.nextInt();
        }
        return a;
    }

    public static int getInitialValueFromSc(String msg) {
        Scanner scanner = new Scanner(System.in);
            System.out.println(msg);
            int value = scanner.nextInt();
        return value;
    }

    public static void fillInSpiral(int width, int height, int value) {
        int regularity = 1;
        int max = (width * height) + value;
        System.out.println("Максимальное значение равно: " + max);
        int[][] mass = new int[height][width];

        while (value < max) {
            int i;
            int j;

            for (i = regularity - 1, j = regularity - 1; j < width - regularity + 1; j++) {
                    mass[i][j] = value;
                    value++;
            }

            for (i = regularity, j = width - regularity; i < height - regularity + 1; i++) {
                    mass[i][j] = value;
                    value++;
            }

            for (i = height - regularity, j = width - regularity - 1; j >= regularity - 1; j--) {
                    mass[i][j] = value;
                    value++;
            }

            for (i = height - regularity - 1, j = regularity - 1; i > regularity - 1; i--) {
                    mass[i][j] = value;
                    value++;
            }
            regularity++;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(mass[i][j] < 10 ) System.out.print(" ");
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}

////ТРЕНЕРОВКА В ПРОЦЕДУРКЕ
//public static class Training {
//    //Заполнение столбцов
//    public static void main(String[] args) {
//        int width = 10;
//        int height = 10;
//        int count = 1;
//        int regularity = 1;
//        int max = (width * height) + count;
//        System.out.println(max);
//        int[][] mass = new int[height][width];
//
//        while (count < max) {
//            int i;
//            int j;
//
//            for (i = regularity - 1, j = regularity - 1; j < width - regularity + 1; j++) { //i = 1, j = 1; j < width - 1; j++
//                if (count != max) {
//                    mass[i][j] = count;
//                    count++;
//                } else {
//                    break;
//                }
//            }
//
//            for (i = regularity, j = width - regularity; i < height - regularity + 1; i++) { // i = 2, j = width - 2; i < height - 1; i++
//                if (count != max) {
//                    mass[i][j] = count;
//                    count++;
//                } else {
//                    break;
//                }
//            }
//
//            for (i = height - regularity, j = width - regularity - 1; j >= regularity - 1; j--) { // i = height - 2, j = width - 3; j >= 1; j--
//                if (count != max) {
//                    mass[i][j] = count;
//                    count++;
//                } else {
//                    break;
//                }
//            }
//
//            for (i = height - regularity - 1, j = regularity - 1; i > regularity - 1; i--) { // i = height - 3, j = 1; i > 1; i--
//                if (count != max) {
//                    mass[i][j] = count;
//                    count++;
//                } else {
//                    break;
//                }
//            }
//            regularity++;
//        }
//
//            /*
//            a = 1;
//
//            i = 0, j = 0; j < width - 0; j++    i = 0, j = 0; j < width - i; j++
//            i = 1, j = 1; j < width - 1; j++
//
//            i = 1, j = width - 1; i < height; i++   i = 1, j = width - a; i < height; i++
//            i = 2, j = width - 2; i < height - 1; i++
//
//            i = height - 1, j = width - 2; j >= 0; j--  i = height - a, j = width - a - 1; j >= a - 1; j--
//            i = height - 2, j = width - 3; j >= 1; j--
//
//            i = height - 2, j = 0; i > 0; i--   i = height - a - 1, j = a - 1; i > a - 1; i--
//            i = height - 3, j = 1; i > 1; i--
//
//            a++;
//             */
//
//        //.............................
//
////            for (i = 1, j = 1; j < width - 1; j++) { //i = 1, j = 1; j < width - 1; j++
////                if (count != max) {
////                    mass[i][j] = count;
////                    count++;
////                } else {
////                    break;
////                }
////            }
////
////            for (i = 2, j = width - 2; i < height - 1; i++) { // i = 2, j = width - 2; i < height - 1; i++
////                if (count != max) {
////                    mass[i][j] = count;
////                    count++;
////                } else {
////                    break;
////                }
////            }
////
////            for (i = height - 2, j = width - 3; j >= 1; j--) { // i = height - 2, j = width - 3; j >= 1; j--
////                if (count != max) {
////                    mass[i][j] = count;
////                    count++;
////                } else {
////                    break;
////                }
////            }
////
////            for (i = height - 3, j = 1; i > 1; i--) { // i = height - 3, j = 1; i > 1; i--
////                if (count != max) {
////                    mass[i][j] = count;
////                    count++;
////                } else {
////                    break;
////                }
////            }
////
////            //.............................
////
////            for (i = 2, j = 2; j < width - 2; j++) { //i = 1, j = 1; j < width - 1; j++
////                if (count != max) {
////                    mass[i][j] = count;
////                    count++;
////                } else {
////                    break;
////                }
////            }
//
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                System.out.print(mass[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//
//}
//}
