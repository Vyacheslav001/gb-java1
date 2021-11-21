package Lesson6.DZ6;

public class CatDZ extends AnimalDZ {

    public CatDZ(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать!");
    }
}
