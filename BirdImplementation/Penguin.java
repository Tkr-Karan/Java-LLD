package BirdImplementation;

public class Penguin extends Bird {

    public Penguin(String name){
        super(name);
    }

    public void fly(){
        System.out.println(name  + " Bird is flying from Penguin class");
    }
}
