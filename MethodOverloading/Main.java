package MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.doSomething("Karan", 21);

        Instructor s2 = new Instructor();

        s2.doSomething("Kumar", 22);
    }
}
