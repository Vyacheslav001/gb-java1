package Lesson6.VideoLesson;

public class Test {
    public static void main(String[] args) {

//Test1

        int i = 8;
        System.out.println(i++);
        System.out.println(i + 1);
        System.out.println(i);
    }
}

//Test2

class Task1 {
    public static void main(String[] args) {
        System.out.println(new Task1());
        //РЕЗУЛЬТАТ Lesson6.VideoLesson.Task1@3feba861 (ссылка на новый экземпляр класса в памяти)
    }
}

//Test3

class F {
    {
        System.out.println("dym f");
    }

    static {
        System.out.println("stat f");
    }

    F() {            //Конструктор класса F
        System.out.println("F");
    }

    public static void main(String[] args) {
        new G();
    }
}

class G extends F {
    {
        System.out.println("dym g");
    }

    static {
        System.out.println("stat g");
    }

    G() {            //Конструктор класса G
        System.out.println("G");
    }
}

//РЕЗУЛЬТАТ
//      stat f      Статика сразу грузится в память в момент компиляции программы
//      stat g
//      dym f
//      F
//      dym g
//      G
//Сначала реализуется конструктор родительского класса

//Test4  (07:54)

class Test1 {
    public static void ChangeNum(int a) {
        a = 3;
    }

    public static void ChangeA(Aa a) {
        a.i = 3;
    }

    public static void main(String[] args) {
        int i = 7;
        ChangeNum(i);
        System.out.println(i);
        Aa a = new Aa();
        ChangeA(a);
        System.out.println(a.i);
    }
}

class Aa {
    int i = 5;

    public Aa() {
        ++i;
    }
}