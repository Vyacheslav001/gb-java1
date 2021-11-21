package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Cross {

    //2
    static int SIZE_X = 3;
    static int SIZE_Y = 3;

    //1
    static char[][] field = new char[SIZE_X][SIZE_Y];

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    //3
    static char PLAYER_DOT = 'X';
    static char AI_DOT = '0';
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

    public static void setSymbol(int y, int x, char sym) {
        field[y][x] = sym;
    }

    public static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X Y (1-3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSymbol(y, x, PLAYER_DOT);
    }

    public static void aiStep() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));
        setSymbol(y, x, AI_DOT);
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
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

    //   АВТОМАТИЗИРОВАННОЕ РЕШЕНИЕ
    public static boolean checkWinLine(char[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                for (int k = j + 1; k < mass.length; k++) {
                    if (mass[j] == mass[k]) {
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //    РУЧНОЕ РЕШЕНИЕ
//    public static boolean checkWin(char sym) {
//        if (field[0][0] == sym && field[0][1] == sym && field[0][2] == sym) {
//            return true;
//        }
//        if (field[1][0] == sym && field[1][1] == sym && field[1][2] == sym) {
//            return true;
//        }
//        if (field[2][0] == sym && field[2][1] == sym && field[2][2] == sym) {
//            return true;
//        }
//            if (field[0][0] == sym && field[1][0] == sym && field[2][0] == sym) {
//                return true;
//            }
//            if (field[0][1] == sym && field[1][1] == sym && field[2][1] == sym) {
//                return true;
//            }
//            if (field[0][2] == sym && field[1][2] == sym && field[2][2] == sym) {
//                return true;
//            }
//            if (field[0][0] == sym && field[1][1] == sym && field[2][2] == sym) {
//                return true;
//            }
//            if (field[2][0] == sym && field[1][1] == sym && field[0][2] == sym) {
//                return true;
//            }
//            return false;
//        }

        public static void main (String[]args){
            initField();
            printField();
            while (true) {
                playerStep();
                printField();
//                if (checkWin(PLAYER_DOT)) {
                if (checkWinLine(field)) {
                    System.out.println("Player WIN!!!");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("DRAW");
                    break;
                }
                aiStep();
                printField();
//                if (checkWin(AI_DOT)) {
                if (checkWinLine(field)) {
                    System.out.println("AI WIN!!!");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("DRAW");
                    break;
                }
            }
        }
    }
