package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class CrossRepeat {
    static int SIZE_X = 3;
    static int SIZE_Y = 3;
    static int SIZE_WIN = 3;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static char PLAYER_DOT = 'X';
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';

    public static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printField() {
        System.out.println("-------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");

    }

    public static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    public static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты x y от 1 до " + SIZE_X + ":");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);
    }

    public static void aiStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты x y от 1 до " + SIZE_X + ":");
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));
        setSym(y, x, AI_DOT);
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            System.out.println("Вы ввели неверные координаты.");
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    public static boolean isFieldFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

//    public static boolean checkWin(char sym) {
//        int count = 0;
//        for (int i = 0, j = 0; j < SIZE_X; j++){
//if (field[i][j] == sym){
//    count++;
//} else {
//    count = 0;
//}
//        }
//    }
//
//
//    public static void main(String[] args) {
//        initField();
//        printField();
//        while (true) {
//            playerStep();
//            printField();
//            if (checkWin(PLAYER_DOT)) {
//                System.out.println("Player WIN!");
//                break;
//            }
//            if (isFieldFull()) {
//                System.out.println("DRAW");
//                break;
//            }
//            aiStep();
//            printField();
//            if (checkWin(AI_DOT)) {
//                System.out.println("AI WIN!");
//                break;
//            }
//            if (isFieldFull()) {
//                System.out.println("DRAW");
//                break;
//            }
//        }
//    }
}
