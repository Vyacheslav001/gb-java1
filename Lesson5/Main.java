package Lesson5;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", "red", 10);
        cat1.info();
        cat1.setName("Barsik");
        cat1.info();
        System.out.println(cat1.getName());
        System.out.println("------------------------");

        Cat cat2 = cat1;
        cat1.info();
        cat2.info();

        cat1.setAge(20);
        cat2.info();

        cat2.setAge(30);
        cat1.info();

//        Cat cat2 = new Cat("Barsik", "black", 5);
//        Cat cat3 = new Cat("black", 5);
//        Cat cat4 = new Cat("green", 1);
//
//        cat1.info();
//        cat2.info();
//        cat3.info();
//        cat4.info();
//
//        System.out.println(Cat.name);
//
//        cat1.name = "Vaska";
//        cat1.color = "red";
//        cat1.age = 10;
//
//        cat1.info();
//
//        Cat cat2 = cat1;
//
//        cat2.name = "Barsik";
//        cat2.color = "black";
//        cat2.age = 5;
//
//        cat2.info();
//
//        Cat cat3 = cat2;
//
//        cat3.name = "Murzik";
//        cat3.color = "White";
//        cat3.age = 3;
//
//        cat3.info();
//
//        cat2 = cat1;
//        cat2.info();
    }
}

class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String color, int age) {
        this.name = "noname";
        this.color = color;
        this.age = age;
    }

    public Cat() {
        name = "Barsik";
        color = "black";
        age = 5;
    }


    void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным");
        }
    }
}
