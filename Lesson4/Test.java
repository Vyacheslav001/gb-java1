package Lesson4;

public class Test {

    //    1
    public static void main(String[] args) {

        System.out.println("Task 1");

//        float d = 12.3; //нужно добавить f в конце числа
//        System.out.println(d);

//---------------------------------------------------

        System.out.println("Task 2");

        System.out.println(1 % 2 == 1);

//---------------------------------------------------

        System.out.println("Task 3");

        String str = "abc";

        switch (str) {
            case "ab":
                System.out.println("ab");
            case "abc":
                System.out.println("abc");
            default:
                System.out.println("break");
            case "abcd":
                System.out.println("abcd");
        }

//---------------------------------------------------


        System.out.println("Task 4");
        for (int i = 0; i < 5; i += 2) {
            System.out.println(i++);
        }

//---------------------------------------------------

        System.out.println("Task 5");

        {
            int i = 20;
        }
        int i = 15;

        System.out.println(i);

//---------------------------------------------------

        System.out.println("Task 6");
        int k = 2;

        do {
            System.out.println(++k);
        } while (k == 3);

//---------------------------------------------------

//        System.out.println("Task 7");
//        while (true) {
//            int l = 5;
//            System.out.println(i);
//            if (l++ == 6) {
//                break;
//            }
//        }

//---------------------------------------------------

        System.out.println("Task 8");
        for (int j = -1; j < 10; j += 2) {
            if (j == 2) {
                continue;
            }
            if (j > 5) {
                break;
            }
            System.out.println(++j);
        }

//---------------------------------------------------

        System.out.println("Task 9");

//        System.out.println(11 / 0); //ДЕЛИТЬ НА НОЛЬ НЕЛЬЗЯ! Выйдет ошибка (Exception)

//---------------------------------------------------    

        System.out.println("Task 10");

        double d1 = 11. / 0;
        double d2 = 15. / 0;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1 - d2);

        //РЕЗУЛЬТАТ
        //Infinity (при делении дубля с точкой на ноль получается не ошибка, а бесконечность
        //Infinity
        //NaN (Not a Number) (мы вычли из бесконечности бесконечность)
        //Infinity (мы сложили 2 бесконечности)
    }
}