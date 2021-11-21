package Lesson2;

/*
Урок 1. с Артемом.
 */

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int a = 4;
        int x1;
        int x2 = 0;
        if (a == 1) {
            System.out.println("a = 1");
        } else if (a == 3) {
            System.out.println("a = 3");
        } else {
            System.out.println("Ни одно из условий не сработало");
        }
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            default:
                System.out.println("Ни один из case не сработал");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("end");
        for (x1 = 20; x1 >= 0; x1 -= 5) {
            System.out.print(x1 + " ");
        }
        System.out.println();
        for (int count = 5; count < 10; count++) {
            x2 += count;
            System.out.print(x2 + " ");
        }
        System.out.println();
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i-j: " + i + "-" + j);
        }
        for (int i = 0; i < 10; i++) {
            if (i > 3) {
                break;
            }
            System.out.println("i = " + i);
        }
        String[] sm = {"A", "B", "C", "D"};
        for (String o : sm) {
            System.out.print(o + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("" + i + j + " ");
            }
        }
        System.out.println();
        int z = 1;
        int x = 10;
        int c = 0;
        if (z != 0) {
            System.out.println("z не равно нулю");
            c = x / z;
            System.out.println("x / z равно " + c);
        } else {
            System.out.println("z = 0. Делить на 0 нельзя");
        }
        for (int i = 0; i < 3; i++) {
            int y = -1;
            System.out.println("y = " + y);
            y++;
            System.out.println("y = " + y);
        }
        // МАССИВЫ
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        int m = 3;
        int[] arr1 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = m + i;
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        int[] nums0 = new int[4];
        nums0[0] = 5;
        nums0[1] = 10;
        nums0[2] = 15;
        nums0[3] = 15;
        //
        int[] nums = {5, 10, 15, 20};
        //
        int[] arr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr2[i] = i;
        }
        String[] arr3 = {"A", "B", "C", "D",};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        //
        int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
        int[][] table2 = new int[3][];
        table2[0] = new int[1];
        table2[1] = new int[5];
        table2[2] = new int[3];
        System.out.println(table2);
        //
        int[][][] mdarr = new int[2][3][4];
        //
        int[] arr4 = {2, 4, 5, 1, 2, 3, 4, 5};
        System.out.println("arr4.lenght: " + arr4.length);
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
