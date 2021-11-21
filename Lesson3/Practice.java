package Lesson3;

public class Practice {

    public static void main(String[] args) {
        System.out.println(8 % 4);
    }
//        String str1 = "apple";
//        String str2 = "gypted";
//        if (str1 == str2){
//            System.out.println("Слова одинаковы");
//        } else {
//            System.out.println("Слова разные");
//        }
////        word(str1, str2);
//    }
//
//    public static void word(String str1, String str2) {
//        char x = 'X';
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.charAt(i) == str2.charAt(i)) {
//                System.out.print(str1.charAt(i));
//            } else {
//                System.out.print(x);
//            }
//        }
//        for (int i = str1.length(); i < 16; i++) {
//            System.out.print(x);
//        }
//    }

//        /**
//         * @param args
//         */
//        int n = 5;
//        int i, j, k, l;
//        int matr[][] = new int[n][n];
//        for (i = 0; i < n; ++i)
//            for (j = 0; j < n; ++j)
//                matr[i][j] = i * 10 /*+ j*/;
//
//        for (i = 0; i < n; ++i, System.out.println())
//            for (j = 0; j < n; ++j)
//                System.out.print(matr[i][j] + " ");
//        System.out.println();
//
//        int temp[] = new int[n];
//        for (j = 0; j < n; ++j)
//            temp[j] = 0;
////
//        for (k = 1; k < n; ++k) {
//            for (i = 0; i < n - k; ++i) {
//                for (j = 0; j < n; ++j) {
//                    for (l = i; l < i + k + 1; ++l) {
//                        temp[j] += matr[l][j];
//                    }
//                }
//                for (j = 0; j < n; ++j) {
//                    System.out.print(temp[j] + " ");
//                    temp[j] = 0;
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//    }


////Треугольник Флойда
//        int a = 1;
//        for (int i = 1; i < 7; i++) {
//            for (int j = i; j > 0; j--) {
//                System.out.print(a++ + " ");
//            }
//            System.out.println();
//        }
//    }

////Треугольник
//        int a = 0;
//        for (int i = 1; i < 10; i++) {
//            System.out.println("---------");
//            for (int j = 1; j < 10; j++) {
//                a = i * j;
//                System.out.println(i + " * " + j + " = " + a);
//            }
//        }
//    }


//        int side = 3;
//        int[][] mass = new int[side][side];
//        int i, j;
//        for (i = 0, j = side - 1; i < side; i++, j--) {
////        for (i = 0; i < side; i++) {
////            for (j = side - 1; j >= 0; j--) {
////            for (j = 0; j < side; j++) {
//                mass[i][j] = 1;
//                mass[i][i] = 2;
////                mass[j][i] = 3;
////                mass[j][j] = 4;
////                System.out.print(mass[i][j] + " ");
//            }
////            System.out.println();
////        }
////        System.out.println();
////    }
//
//        for (int k = 0; k < mass.length; k++) {
//            for (int l = 0; l < mass.length; l++) {
//                System.out.print(mass[k][l] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//}

//    public static void main(String[] args) {
//        int var = 20;
//        System.out.println(wrongReturn(var));
//    }
//
//    public static boolean wrongReturn(int x) {
//        if (x < 10) {
//            return true;
//        }
//        return false;
//    }
//}
//    public static void main(String[] args) {
//        int[] array = new int[6];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = 5;
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(arrSum(array));
//    }
//
//    public static int arrSum(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            //sum = sum + arr[i];
//        }
//        return sum;
//    }
//}

//        public static void main(String[] args) {
//        int mass[][] = new int[5][8];
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length; j++) {
//            }
//        }
//        print2DArray(mass, 1);
//    }
//
//    public static void print2DArray(int[][] mass, int counter) {
//        for (int i = 0; i <= mass[0].length; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < mass.length; i++) {
//            System.out.print(i + 1 + " ");
//            for (int j = 0; j < mass[i].length; j++) {
//                mass[i][j] = counter;
//                System.out.print(mass[i][j] + " ");
//                counter++;
//            }
//            System.out.println();
//        }
//    }
//
////    public static void print2DArray(int[][] mass) {
////        System.out.print("  ");
////        for (int i = 0; i < mass.length; i++) {
////            System.out.print(i + 1 + " ");
////        }
////        System.out.println();
////        for (int i = 0; i < mass.length; i++) {
////            System.out.print(i + 1 + " ");
////            for (int j = 0; j < mass[i].length; j++) {
////                System.out.print(mass[i][j] + " ");
////            }
////            System.out.println();
////        }
////    }
}


