package Lesson6.VideoLesson;

public class Animal {
    protected String name;
    public Animal(){

    }

    public Animal(String name){
        this.name = name;
    }

    public void info(){
        System.out.println("Animal: " + name);
    }

    //Переопределение методов

    void voice(){
        System.out.println("Животное издало звук");
    }
}


