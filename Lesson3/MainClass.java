package Lesson3;

import java.io.File;
import java.util.Scanner;

public class MainClass {
//    public static void main(String[] args) {
//
//    }
//
//    public static boolean wrongReturn(int x) {
//        if(x < 10) {
//            return true;
//        }
//    }


}

////ЧТЕНИЕ ИЗ ФАЙЛА
//    public static void main(String[] args) {
//        File file = new File("C:\\Users\\Андрей\\Desktop\\testNew\\testNewFile.txt");
//        Scanner sc = null;
//        try {
//            sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                String str = sc.nextLine();
//                System.out.println(str);
//            }
//        } catch (Exception e) {
//            System.out.println("файл не найден");
//        }
//    }
//}

//СРАВНЕНИЕ
//    public static void main(String[] args) {
//        String str1 = "hell";
//        String str3 = str1 + "o";
//        String str2 = "hello";
//        System.out.println(str1 + " " + str2 + " " + str3);
//        System.out.println(str2 == str3);
//        System.out.println(str2.equals(str3));
//
//        System.out.println("ЧАРЫ:");
//
//        char ch1 = '.';
//        char ch2 = '.';
//        char ch3 = 'X';
//        System.out.println(ch1 == ch2);
//        System.out.println(ch1 == ch3);
//    }
//}

////ЦИКЛ FOREACH
//    public static void main(String[] args) {
//        infoSum(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        infoSum(1, 2);
//    }
//
//    public static void infoSum(int a, int... arg) {
//        for (int x : arg) {
//            System.out.print(x);
//        }
//        System.out.println();
//    }
//
//    public static void infoSum(int a, int b) {
//        System.out.println("Второй метод");
//    }
//}

////ПЕРЕГРУЗКА МЕТОДОВ
//    public static void main(String[] args) {
//        infoSum(2, 3);
//        infoSum(2, 67, 5);
//        infoSum(2, 67, 5, 6);
//    }
//
//    public static void infoSum(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    public static void infoSum(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }
//
//    public static void infoSum(int a, int b, int c, int d) {
//        System.out.println(a + b + c + d);
//    }
//
//}

////РАНДОМ

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getRandomTicket()));
//    }
//
//    public static int[] getRandomTicket() {
//        Random random = new Random();
//        int[] mass = new int[6];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = random.nextInt(99) + 1;
//        }
//        return mass;
//    }
//}

//    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println(random.nextInt(10000));
//        System.out.println(Math.random() + 1);
//        String[] colors = {"Red", "Green", "Black"};
//        int pos = random.nextInt(colors.length);
//        System.out.println(colors[pos]);
//    }

////СКАНЕР

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите id: ");
//        int id = scanner.nextInt();
//        sqlQuery(id);
//    }
//
//    public static void sqlQuery(int id) {
//        String sql = String.format("SELECT id FROM tadle where id = %s", id);
//        System.out.println(sql);
//    }
//}

//        System.out.printf("Строка %s дробь %.3f целое %d символ %c", "Hello", 4.5f, 20, 'r');
//    }
//}

//    static Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {
//        int res = getNumberFromSc("Введите данные от 10 до 20", 10, 20);
//        System.out.println(res);
//    }
//
//    public static int getNumberFromSc(String msg, int min, int max) {
//        int x;
//        do {
//            System.out.println(msg);
//            x = scanner.nextInt();
//        } while (x < min || x > max);
//        return x;
//    }
//}

//        Scanner sc = new Scanner(System.in);// создание объекта класса Scanner
//        //int a = sc.nextInt();               // чтение целого числа в переменную a
//        String b = sc.nextLine();           // чтение введенной строки
//        int a = Integer.parseInt(b);
//        System.out.println(a + " " + b);
//    }
//}


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int a = sc.nextInt();
//        System.out.print("Введите текст: ");
//        String b = sc.nextLine();
//        System.out.print("Введите текст: ");
//        String c = sc.next();
//        System.out.println(a + " " + b + " " + c);
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int a = sc.nextInt();
//        a *= 2;
//        System.out.println("Введенное вами число, умноженное на 2, равно " + a);
//        sc.close();
//    }
//}

//class MainClass2 {
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int d = getNumberFromScanner("Введите число в пределах от 5 до 10", 5, 10);
//        System.out.println("d = " + d);
//    }
//
//    public static int getNumberFromScanner(String message, int min, int max) {
//        int x;
//        do {
//            System.out.println(message);
//            x = sc.nextInt();
//        } while (x < min || x > max);
//        return x;
//    }
//}

//class MainClass3 {
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int d = getArrFromScanner("Введите массив", 5, 10);
//        System.out.println("d = " + d);
//    }

//    public static int getNumberFromScanner(String message, int min, int max) {
//        int arr;
//        do {
//            System.out.println(message);
//            arr = sc.nextInt();
//        } while (x < min || x > max);
//        return x;
//    }
//}
