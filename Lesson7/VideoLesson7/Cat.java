package Lesson7.VideoLesson7;

public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        p.deacreaseFood(appetite);
    }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void deacreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("plate " + food);
    }
}

class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 999);
        Plate plate = new Plate(1000);

        plate.info();
        cat.eat(plate);
        plate.info();
    }
}