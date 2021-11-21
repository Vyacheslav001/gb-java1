package Lesson7.VideoLesson7;

import java.util.Scanner;

public class Plate2 {
    private int food;
    private int add_food;
//    private int additive; //добавка

    public Plate2(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put food in a plate: ");
        add_food = scanner.nextInt();
        food += add_food;
    }

    public boolean checkFullPlate(int appetit) {
        if (food >= appetit) {
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("In plate " + food + " food.");
    }
}
