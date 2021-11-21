package Lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T1 {

//    Вариант 1.

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("E:\\F.txt");

        Scanner sc = new Scanner(file);

        String line = sc.nextLine();
        System.out.println(line); //печать строки в стандартный вывод
    }
}

//    Вариант 2.
//
//    public static void main(String[] args) {
//
//        File file = new File("E:\\F.txt");
//
//        Scanner sc = null;
//
//        try {
//
//            sc = new Scanner(file);
//
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line); //печать строки в стандартный вывод
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            sc.close();
//        }
//
//    }
//}