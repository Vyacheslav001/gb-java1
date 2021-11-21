package Lesson3;

import java.io.File;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClassRepeat {

    //СКАНЕР nextLine() СЧИТЫВАЕТ СИМВОЛ КАРЕТКИ и ПРОЧИЕ ЧУДЕСА
    public static class Example1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println(a);
            System.out.println("-----");
            String c = scanner.next();
            System.out.println(c);
            System.out.println("-----");
            String b = scanner.nextLine();
            System.out.println(b);
            System.out.println("-----");

            int d = Integer.parseInt(c); // переводим строку в число

            System.out.println(a + " " + b + " " + c + " " + d);
        }
    }

    //ВВОД ПОЛЬЗОВАТЕЛЕМ ЧИСЛА В ЗАДАННОМ ДИАПАЗОНЕ
    public static class Example2 {
        public static void main(String[] args) {
            String message = "Введите число в пределах от 5 до 10: ";
            System.out.println(getNumberFromSc(message, 5, 10));
        }

        public static int getNumberFromSc(String msg, int min, int max) {
            Scanner scanner = new Scanner(System.in);
            int x;
            do {
                System.out.println(msg);
                x = scanner.nextInt();
            } while (x < min || x > max);
            return x;
        }
    }

    //ФОРМАТИРОВАНИЕ
    public static class Example3 {
        public static void main(String[] args) {
            System.out.printf("Строка %s дробь %.2f целое %d символ %c", "Hello", 4.5f, 20, 'r');
            System.out.println();
            sqlQeury("543645");
        }

        public static void sqlQeury(String id) {
            String sql = String.format("SELECT id FROM table where id = '%s'", id);
            System.out.println(sql);
        }
    }

    //РАНДОМ
    public static class Example4 {
        public static void main(String[] args) {
            Random random = new Random();
            System.out.println(random.nextInt(20) - 20); //0 включительно, 10 не включительно
            //к сгенерированному числу прибавляем необходимое нам знаяение для получения нужного диапазона

            System.out.println(Math.random()); //от 0 до 1
            // Math.random() не требует создания объекта

            String[] colors = {"Red", "Green", "Black"};
            int pos = random.nextInt(colors.length);
            System.out.println(colors[pos]);
        }


    }

    // 1:30 видеоурока
    //ЛОТЕРЕЯ
    public static class Example5 {
        public static void main(String[] args) {
            System.out.println(Arrays.toString(getRandomTicket()));
        }

        public static int[] getRandomTicket() {
            Random random = new Random();
            int[] mass = new int[6];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = random.nextInt(99) + 1;
            }
            return mass;
        }
    }

    //ПЕРЕГРУЗКА МЕТОДОВ
    public static class Example6 {
        public static void main(String[] args) {
            infoSum(4, 2);
            infoSum(4, 2, 2);
            infoSum(4, 2, 4, 3);
        }

        public static void infoSum(int a, int b) {
            System.out.println(a + b);
        }

        public static void infoSum(int a, int b, int c) {
            System.out.println(a + b + c);
        }

        public static void infoSum(int a, int b, int c, int d) {
            System.out.println(a + b + c + d);
        }
    }

    //АРГУМЕНТ ПЕРЕМЕННОЙ ДЛИНЫ
    //методы с аргументами переменной длины лучше не перегружать, т.к. они уже являются перегруженными и Java
    //выдаст ошибку Ambiguous method call. Both (Неоднозначный вызов метода. Оба).
    public static class Example7 {
        public static void main(String[] args) {
            infoSum(1, 1, 2, 3); //Ambiguous method call. Both (Неоднозначный вызов метода. Оба)
            System.out.println();
            infoSum(1, 1); //при перегрузке сработает третий метод, т.к. он раньше введен в язык
        }

        public static void infoSum(int a, int... arg) {
            for (int x : arg) {
                System.out.print(x + " ");
            }
        }

//        public static void infoSum(int a, int b, int... arg2) {
//            for (int x : arg2) {
//                System.out.print(x + " ");
//            }
//        }

        public static void infoSum(int a, int b) {
            System.out.println("Третий метод");
        }
    }

    // 1:48:36 видеоурока
    //СРАВНЕНИЕ СТРОК
    public static class Example8 {
        public static void main(String[] args) {
            //Вариант 1
            String str1 = "hello";
            String str2 = "hello";
            System.out.println(str1 == str2);
            System.out.println(str1.equalsIgnoreCase(str2));
            //РЕЗУЛЬТАТ:
            //  true
            //  true
            //В Кэшэ Компилятора образуется одна и таже ссылка на объект с одинаковым содержимым.

            //Вариант 2
            String str3 = "hell";
            String str4 = str3 + "o";
            String str5 = "hello";
            System.out.println(str3 + " " + str4 + " " + str5);
            System.out.println(str4 == str5);
            System.out.println(str4.equals(str5));
        }
    }

    //ЧТЕНИЕ ИЗ ФАЙЛА
    public static class Example9 {
        public static void main(String[] args) {
            File file = new File("E:\\WORK\\EDUCATION\\GEEKBRAINS\\4. Java. Уровень 1\\АРХИВ АРТЕМ\\Урок 3\\ЧТЕНИЕ ИЗ ФАЙЛА\\testNewFile.txt");
            Scanner scanner = null;
            try {
                scanner = new Scanner(file);
                while (scanner.hasNextLine()) { /*hasNextLine - метод возвращает 2 значения (true или false),
                                                в зависимости от того, есть ли в файле еще хотяб ы одна строчка
                                                или нет*/
                    String str = scanner.nextLine();
                    System.out.println(str);
                }
            } catch (Exception e) {
            }
        }
    }
}
    //DZ 2:05:50


