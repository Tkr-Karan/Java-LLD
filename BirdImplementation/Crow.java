package BirdImplementation;

public class Crow extends Bird{
    public Crow(String name){
        super(name);
    }

    public void fly(){
        System.out.println(name + " Bird Flying from Crow Constructor");
    }
}
