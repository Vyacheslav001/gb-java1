package Lesson3.VertexTraining;

import java.util.Arrays;

public class Part4 {
    public static void main(String[] args) {
//        int a = 1;
////        int[][] mass = new int[11][2];
//        for (int i = 1; i <= 11; i++) {
//            for (int j = 0; j < 2; j++) {
//                j = j + i;
//                System.out.print(j + " ");
//            }
//        }
//    }
//        int a = 1;
//        int[] mass = new int[15];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = a;
//            System.out.print(mass[i] + " ");
//        }
//        System.out.println();
//        int[] mass2 = new int[11];
//        for (int i = 0; i < mass.length; i++) {
////            mass2[i] = mass[i];
//            mass2[i + 2] = mass[i] + mass[i + 1];
//            System.out.print(mass2[i] + " ");
//
//        }
//
//    }
//        int a = 1;
//        int b = 1;
//        int sum1;
//        int sum2;
//        int[] mass = new int[11];
//        for (int i = 0; i < mass.length; i++) {
//            if (i == mass.length - 1) break;
//            mass[i] = a;
//            mass[i + 1] = b;
//            System.out.print(mass[i] + " " + mass[i + 1] + " ");
//            mass[i] = a + b;
//            mass[i + 1] = mass[i] + b;
//            a = mass[i];
//            b = mass[i + 1];
//        }
//        System.out.println(Arrays.toString(mass));
//        int[] mass2 = new int[11];
//        for (int i = 0; i < 11; i++) {
//            mass2[i] = mass[i];
//            System.out.print(mass2[i]);
//        }
//    }


        int a = 1;
        int b = 1;
        int sum;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 11; i++) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }


//        int[][] mass = new int[11][2];
//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 2; j++) {
//                mass[i][j] = 1 + i;
//                System.out.print(mass[i][j]);
//            }
//            System.out.println();
//        }


//        for (int i = 0; i < 11; i++) {
//            System.out.print(a + " ");
//            for (int j = 0; j < 1; j++) {
//                a += a;
//            }
//        }
}
