package Lesson6.DZ6;

public class Main {
    public static void main(String[] args) {
        CatDZ[] catDZarr = {
                new CatDZ("Vaska"),
                new CatDZ("Barsik")
        };
        DogDZ[] dogDZSarr = {
                new DogDZ("Bobik")
        };

        catDZarr[0].run(100);
        catDZarr[0].swim(50);
        catDZarr[1].run(150);
        catDZarr[1].swim(70);
        dogDZSarr[0].run(300);
        dogDZSarr[0].swim(100);

        System.out.println("Количество котов: " + catDZarr.length);
        System.out.println("Количество собак: " + dogDZSarr.length);
        System.out.println("Всего животных: " + (catDZarr.length + dogDZSarr.length));


//        for (int i = 0; i < catDZmass.length; i++) {
//            catDZmass[i].run(100);
//            catDZmass[i].swim(50);
//        }

//        CatDZ catDZ1 = new CatDZ("Vaska");
//        CatDZ catDZ2 = new CatDZ("Barsik");
//        DogDZ dogDZ1 = new DogDZ("Bobik");
//        catDZ1.run(20);
//        catDZ1.swim(40);
//        catDZ2.run( 100);
//        catDZ2.swim(150);
//        dogDZ1.run(300);
//        dogDZ1.swim(120);
    }
}
