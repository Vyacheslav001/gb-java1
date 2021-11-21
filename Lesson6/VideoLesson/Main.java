package Lesson6.VideoLesson;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Cat cat = new Cat("Vaska", "Black");
        cat.infoCat();
        cat.info();

    //Переопределение методов
        Animal a = new Animal();
        Cat c = new Cat();
        a.voice();
        c.voice();
    }

}
