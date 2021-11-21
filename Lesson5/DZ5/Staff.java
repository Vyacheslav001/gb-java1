package Lesson5.DZ5;

public class Staff {

    private String name;
    private String post;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public Staff(String name, String post, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void staffInfo(){
        System.out.println(name + " " + post + " " + email + " " + phone_number + " " + salary + " " + age);
    }
}
