package Lesson6.VideoLesson;

import java.lang.reflect.Field;

public class A {
    //Рефлексия
    private String field = "private Var";
}

class B {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        A a = new A();
        Field f = A.class.getDeclaredField("field");
        f.setAccessible(true);
        String fieldValue = String.valueOf(f.get(a));
        System.out.println(fieldValue);
    }
}