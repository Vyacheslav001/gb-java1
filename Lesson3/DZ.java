package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class DZ {

    //Task 1.
    //1	Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки
    // угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
    // чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
    // 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static class Task1 {

        public static void main(String[] args) {
            int number_of_attempts = 3;
            String msg_new_game = "Желаете попробовать снова?\nЕсли да, то введите 1, если нет, то 0.";
            String msg_start = "Компьютер загадал число, попробуйте его отгадать!";
            int cont;
            do {
                game(number_of_attempts, msg_start);
                cont = сontinueTheGame(msg_new_game);
            } while (cont == 1);
            if (cont == 0) System.out.println("Спасибо за игру! До скорых встреч!");
        }

        public static int randomNumber() {
            Random random = new Random();
            int number = random.nextInt(10);
            return number;
        }

        public static int userEnter() {
            System.out.println("Введите число от 1 до 9:");
            Scanner scanner = new Scanner(System.in);
            int number_user = scanner.nextInt();
            return number_user;
        }

        public static boolean checkWin(int number_ai, int number_user) {
            if (number_user == number_ai) return true;
            return false;
        }

        public static void hint(int number_ai, int number_user) {
            if (number_user > number_ai) {
                System.out.println("Ваше число больше");
            } else {
                if (number_user < number_ai)
                    System.out.println("Ваше число меньше");
            }
        }

        public static int сontinueTheGame(String msg) {
            Scanner scanner = new Scanner(System.in);
            int cont;
            do {
                System.out.println(msg);
                cont = scanner.nextInt();
                if (cont < 0 | cont > 1) {
                    System.out.println("Вы ввели неверное значение.");
                }
            } while (cont < 0 | cont > 1);
            return cont;
        }

        public static void game(int number_of_attempts, String msg_start) {
            int random_number = randomNumber();
            int user_number;
//            System.out.println("Компьютер загадал " + random_number);
            System.out.println(msg_start);
            do {
                System.out.println("У Вас осталось " + number_of_attempts + " попытки!");
                user_number = userEnter();
//                System.out.println(random_number);
                if (checkWin(random_number, user_number) == true) {
                    System.out.println("Вы угадали!");
                    break;
                } else {
                    if (number_of_attempts > 1) {
                        hint(random_number, user_number);
                    }else {
                        System.out.println("Вы не угадали((");
                    }
                }
            } while (--number_of_attempts > 0);
        }
    }

    //Task 2.
    //* Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
    // "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
    // "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с
    // загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано,
    // компьютер показывает буквы, которые стоят на своих местах.
    //apple – загаданное apricot - ответ игрока ap############# (15 символов, чтобы пользователь не мог узнать
    // длину слова) Для сравнения двух слов посимвольно можно пользоваться:
    //String str = "apple"; char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой
    // позиции. Играем до тех пор, пока игрок не отгадает слово. Используем только маленькие буквы.
    public static class Task2 {

        public static void main(String[] args) {
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                    "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                    "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            String msg_random_word = "Компьютер загадал слово!";
            String msg_enter = "Отгадайте слово";
            String random_word = randomWord(words, msg_random_word);
            String user_word;
            System.out.println(random_word);

            do {
                user_word = userWord(msg_enter);
                if (random_word.equals(user_word)){
                    System.out.println("Вы угадали!");
                    break;
                }
                compareWords(random_word, user_word);
            } while (!random_word.equals(user_word));

        }

        public static String randomWord(String[] mass, String msg) {
            System.out.println(msg);
            Random random = new Random();
            int random_index = random.nextInt(mass.length);
            String random_word = mass[random_index];
            return random_word;
        }

        public static String userWord(String msg) {
            System.out.println(msg);
            Scanner scanner = new Scanner(System.in);
            String user_word = scanner.nextLine();
            return user_word;
        }

        public static void compareWords(String random_word, String user_word) {
            char x = 'X';
            int langht_word;
            if (random_word.length() <= user_word.length()){
                langht_word = random_word.length();
            } else {
                langht_word = user_word.length();
            }
            for (int i = 0; i < langht_word; i++) {
                if (random_word.charAt(i) == user_word.charAt(i)) {
                    System.out.print(random_word.charAt(i));
                } else {
                    System.out.print(x);
                }
            }
            for (int i = langht_word; i < 15; i++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
























