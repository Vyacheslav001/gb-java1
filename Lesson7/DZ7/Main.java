package Lesson7.DZ7;

public class Main {
    public static void main(String[] args) {
        Cat2[] cat = {
                new Cat2("Vaska", 300),
                new Cat2("Barsik", 300),
                new Cat2("Murzik", 500)
        };
        Plate2 plate = new Plate2(1000);

        plate.info();

        for (int i = 0; i < cat.length; i++) {
            if (plate.checkFullPlate(cat[i].getAppetite())) {
                cat[i].eat(plate);
                cat[i].infoSatiety();
                plate.info();
            } else {
                cat[i].catAskedForFood();
                while (!plate.checkFullPlate(cat[i].getAppetite())) {
                    plate.addFood();
                }
                cat[i].eat(plate);
                cat[i].infoSatiety();
                plate.info();
            }
        }
    }
}