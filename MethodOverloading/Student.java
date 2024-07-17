package MethodOverloading;

public class Student {

    String name;
    int age;
    String address;
    int id;
    String batchName;


    void doSomething(String name, int age){
        System.out.println("Hello");
    }

    void doSomething(String address, String name,  int id){
        return;
    }


}

class Instructor extends Student{
//    void doSomething(String name, int age){
//        System.out.println("hi");
//    }
}