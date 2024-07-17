package BirdImplementation;

public class Client {
    public static void main(String[] args) {
        Bird b = new Penguin("Penguin");
        Bird p = new Crow("Crow");
        Bird s = new Sparrow();

        s.name = "Sparrow";

        b.fly();
        p.fly();
        s.fly();

    }
}
