package Lesson4;

public class Diagonal {

//    public static void main(String[] args) {
//
//        int side_str = 10;
//        int side_bkw = 1;
//        int[][] mass4 = new int[side_str][side_bkw];
//        crossFill(mass4, side_str, side_bkw);
//        for (int i = 0; i < side_str; i++) {
//            for (int j = 0; j <= side_bkw; j++) {
//                System.out.print(mass4[i][j] + " ");
//            }
//            System.out.println();
//        }
////        System.out.println(mass4.length);
//    }
//
//    private static void crossFill(int[][] mass, int str_len, int bkw_len) {
//        int str, bkw;
////        for (str = 0, bkw = mass.length - 1; str < mass.length; str++, bkw--) {
//        for (str = 0, bkw = bkw_len - 1; str < str_len; str++, bkw--) {
//            mass[str][bkw] = 1;
//            mass[str][str] = 1;
//        }
//    }
//
//}

//    public static void main(String[] args) {
//        int side = 3;
//        int[][] mass = new int[side][side];
//        mass[0][0] = 0;
//        mass[0][1] = 1;
//        mass[0][2] = 0;
//        mass[1][0] = 1;
//        mass[1][1] = 0;
//        mass[1][2] = 0;
//        mass[2][0] = 1;
//        mass[2][1] = 1;
//        mass[2][2] = 1;
//
//        if (mass[0][0] == mass[2][2]) {
//            System.out.println("Yes");
//        } else
//            System.out.println("No");
//
////        for (int i = 0; i < side; i++) {
////            do {
////            for (int j = 0; j < side; j++) {
////                mass[i][j] == mass[i][j + 1];
////            }while (mass[i][j].)
////            }
////
////        }
//
//        for (int i = 0; i < side; i++) {
//            for (int j = 0; j < side; j++) {
//                System.out.print(mass[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//
//    }
//}

//ПРИМЕР С ОДНОМЕРНЫМ МАССИВОМ (ПЕЧАТАЕМ СРАВНЕНИЕ)

//    public static void main(String[] args) {
//        int side = 5;
//        int count = 1;
//        int[] mass = new int[side];
//        mass[0] = 0;
//        mass[1] = 1;
//        mass[2] = 0;
//        mass[3] = 3;
//        mass[4] = 0;
////        for (int i = 0, j = i + 1; i < mass.length; i++, j++) { //НЕВЕРНАЯ ВАРИАЦИЯ ВЫПОЛНЯЕТ ВСЕГО 4 ИТЕРАЦИИ
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = i + 1; j < mass.length; j++) {
//                if (mass[i] != mass[j]) {
//                    System.out.print(count++ + ". ");
//                    System.out.println(mass[i] + " not the same with " + mass[j]);
//                } else {
//                    System.out.print(count++ + ". ");
//                    System.out.println(mass[i] + " the same with " + mass[j]);
//                }
//            }
//        }
//    }
//}
//
//
////ПРИМЕР С ОДНОМЕРНЫМ МАССИВОМ (ПРОВЕРКА НА СОВПАДЕНИЕ СИМВОЛОВ ПОДРЯД)

    public static void main(String[] args) {
        int side = 5;
        int count = 0;
        int limit = 3;
        int[] mass = new int[side];
        mass[0] = 1;
        mass[1] = 1;
        mass[2] = 1;
        mass[3] = 1;
        mass[4] = 1;
        if (checkLine(mass)) {
            System.out.println("Win");
        } else {
            System.out.println("No Win");
        }
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = i + 1; j < mass.length; j++) {
//                if (mass[i] == mass[j]) {
//                    count++;
//                }
//                if (count == limit) {
//                    System.out.println("Win");
//                } else {
//                    count = 0;
//                    break;
//                }
//            }
//        }
    }

    public static boolean checkLine(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

/*
i = 0  j = 1 count = 0
i = 0  j = 2 count = 0
i = 0  j = 1 count = 0
i = 0  j = 1 count = 0
i = 0  j = 1 count = 0
i = 0  j = 1 count = 0
i = 0  j = 1 count = 0
i = 0  j = 1 count = 0
i = 0  j = 1 count = 0
i = 0  j = 1 count = 0




 */
//    //ИСХОДНАЯ ВЕРСИЯ КОДА (ЗАПОЛНЕНИЕ ПО ДИАГОНАЛИ)
//
//    public static void main(String[] args) {
//        final int side = 10;
//        int[][] mass4 = new int[side][side];
//        crossFill(mass4);
//        for (int i = 0; i < mass4.length; i++) {
//            for (int j = 0; j < mass4.length; j++) {
//                System.out.print(mass4[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    private static void crossFill(int[][] mass) {
//        int str, bkw;
//        for (str = 0, bkw = mass.length - 1; str < mass.length; str++, bkw--) {
////        for (str = 0; str < mass.length; str++) {
////            for (bkw = mass.length - 1; str < mass.length; bkw--) {
//            mass[str][bkw] = 1;
//            mass[str][str] = 2;
//        }
//    }
////}
//}
