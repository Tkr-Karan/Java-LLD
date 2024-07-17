package ConstructorChaining;

public class C extends B{

//    C(){
//        System.out.println("C");
//    }

    C(String word){
        System.out.println("C- " + word);
        super.printHello();
    }
}
