package Lesson3.VertexTraining;

public class Part2 {
    public static void main(String[] args) {
//Task 1.
//Var 1.
        int a = 7;
        int b = 0;
        System.out.println("Task 1.");
        System.out.println("Var 1.");
        for (int i = 0; i < 98 / 7; i++) {
            b += a;
            System.out.print(b + " ");
        }
        System.out.println();
//Var 2.
        System.out.println("Var 2.");
        while (b < 98) {
            b += a;
            System.out.print(b + " ");
        }
        System.out.println();
//Task 2.
        System.out.println("Task 2.");
        int x = 1;
        while (x <= 512) {
            System.out.print(x + " ");
            x *= 2;
        }
    }
}

