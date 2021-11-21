package Lesson7.DZ7;

public class Cat2 {
    private String name;
    private int appetite;
//    private int satiety;

    public Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate2 p) {
        p.decreaseFood(appetite);
    }

    public void catAskedForFood() {
        System.out.println("Cat " + name + " didn't have enough food to eat. Cat asks for more.");
    }

    public void infoSatiety() {
        System.out.println("Cat " + name + " eat " + appetite + " food. " + name + " satiety.");
    }
}
