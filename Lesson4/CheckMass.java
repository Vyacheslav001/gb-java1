package Lesson4;

import java.util.Random;

public class CheckMass {

    static char x = 'X';
    static char o = 'O';
    static int SIZE_X = 3;
    static int SIZE_Y = 3;

    static Random random = new Random();
    static char[][] mass = new char[SIZE_Y][SIZE_X];

    public static void main(String[] args) {
        printMass();
    }

//    public static boolean checkLine() {
//        for (int i = 0; i < SIZE_Y; i++) {
//            for (int j = 0; j < SIZE_X; j++) {
//                mass[i][j] =
//            }
//        }
//        return true;
//    }

    public static void printMass() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
//                mass[i][j] = (char) (x + 1);
                mass[i][j] = (char) (o + 1);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
