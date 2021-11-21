package TestProtect;

import Lesson6.VideoLesson.Animal2;

class MainTest {
    public static void main(String[] args) {
        Animal2 animal2 = new Animal2(15);
//        animal2.z = 25;
//        System.out.println(animal2.z);
    }
}

public class TestProtect extends Animal2 {
    public TestProtect(int a) {
        super(a);
    }
}