package Lesson6.VideoLesson;

public abstract class Animal3 {
    public abstract void run();

    public void voice(){
        System.out.println("Животное издало звук!");
    }
}

class Cat3 extends Animal3{

    @Override
    public void run() {
        System.out.println("Кот побежал");
    }

//    final String var = "not edit";//1. создание именованной константы
//    var += "1";
                                    //2. предотвращает переопределение метода
                                    //3. запрет наследования классов
}