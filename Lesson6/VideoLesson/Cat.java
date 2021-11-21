package Lesson6.VideoLesson;

class Cat extends Animal{
    protected String color;

    public Cat() {

    }

    public Cat(String name, String color) {
//        super(name);
        this.name = name;
        this.color = color;
    }

    public void infoCat(){
        System.out.println("Cat: " + name + " " + color);
    }

    //Переопределение методов

    @Override
    void voice() {
        super.voice();
        System.out.println("Кот мяукнул!");
    }
}