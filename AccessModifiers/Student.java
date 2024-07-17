package AccessModifiers;

public class Student
{
    public String name;
    protected  int age;
    double psp;
    private String batchName;

    // we can access the any access modifiers in the same entity or ecosystem

    void doSomething(){
        name = "Karan";
        age = 24;
        psp = 97.8;
        batchName = "June 22";
    }
}
