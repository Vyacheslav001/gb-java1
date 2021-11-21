package Lesson6.VideoLesson;

class SuperCat2 extends Cat2{
    private int c;

    public SuperCat2(int a, int b, int c) {
        super(a, b);
        this.c = c;
//        this.z = z;
    }

    public void testInfoSuperCat(){
//        z = 10;
//        super.z = 20;
        System.out.println(z);
    }
}
