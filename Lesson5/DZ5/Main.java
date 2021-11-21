package Lesson5.DZ5;

public class Main {
    public static void main(String[] args) {
        Staff[] staffArr = new Staff[5];
        staffArr[0] = new Staff("Александр", "Director", "director@mail.ru", "89035556644", 100000, 50);
        staffArr[1] = new Staff("Ольга", "Expert1", "expert1@mail.ru", "356-55-99", 50000, 20);
        staffArr[2] = new Staff("Сергей", "Expert2", "expert2@mail.ru", "356-55-66", 55000, 60);
        staffArr[3] = new Staff("Михаил", "Expert3", "expert3@mail.ru", "356-55-77", 60000, 30);
        staffArr[4] = new Staff("Марина", "Expert4", "expert4@mail.ru", "356-55-88", 70000, 40);

        printStaff40(staffArr);
    }

    private static void printStaff40(Staff[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() >= 40) {
                arr[i].staffInfo();
            }
        }
    }
}
