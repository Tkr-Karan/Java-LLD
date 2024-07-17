package BirdImplementation;

public class Bird {
    // attributes of the birds
    String name;
    int age;
    boolean isFly;
    String type;
    int weight;

    // methods of the birds

    public void fly(){
        System.out.println("Bird " + name + " is flying from Bird class");
    }

    public static void eat(){
        System.out.println("Bird is eating");
    }

    public static void walk(){
        System.out.println("Bird is walking");
    }
    public static void printBirdInfo(String name){
        System.out.println("Bird details -----> " + name);
    }

    // Bird Constructor
    public Bird(){
        System.out.println("Bird Constructor");
    }

    public Bird(String name){
        this.name = name;
    }
}
