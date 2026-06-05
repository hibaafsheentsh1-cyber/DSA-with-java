package Oops;
public class Student {
    public String name;
    public int id;
    private int age;
    public int no_of_sub;

    public Student(String name, int id, int age, int no_of_sub) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.no_of_sub = no_of_sub;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student A = new Student("Hiba", 1, 20, 5);
        System.out.println(A.name);
        System.out.println(A.getAge());
    }
}