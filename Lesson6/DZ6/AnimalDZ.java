package Lesson6.DZ6;

public abstract class AnimalDZ {
    private String name;

    public AnimalDZ(String name) {
        this.name = name;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " метров.");
    }
}
