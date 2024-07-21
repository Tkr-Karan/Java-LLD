package designpatterns.builderPattern;

public class Client {
    public static void main(String[] args) {
        Student s = Student.getBuilder().setName("Karan").setEmail("xyz@mail.com").setAge(24).build();
    }
}
