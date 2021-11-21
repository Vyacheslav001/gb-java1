package Lesson7.VideoLesson7;

public class Cat1 {
    private String name;
    private int appetite;

    public Cat1(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat() {

    }

    public int getAppetite() {
        return appetite;
    }
}

class Plate1 {
    private int food;

    public Plate1(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate " + food);
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
}

class MainClass1 {
    public static void main(String[] args) {
        Cat1 cat = new Cat1("Barsik", 999);
        Plate1 plate = new Plate1(1000);

        plate.info();
        plate.setFood(plate.getFood() - cat.getAppetite());
        plate.info();
    }
}