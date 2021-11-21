package Lesson6.VideoLesson;

public class Shape {
    public void draw(){
        System.out.println("Фигура");
    }
}

class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Квадрат");
    }
}

class Cirkle extends Shape{
    @Override
    public void draw() {
        System.out.println("Круг");
    }
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Треугольник");
    }
}

class MainShape{
    public static void main(String[] args) {
        Shape[] shapes = {new Shape(), new Square(), new Cirkle(), new Triangle()};
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }
}
