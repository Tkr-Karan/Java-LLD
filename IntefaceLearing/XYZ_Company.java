package IntefaceLearing;

public class XYZ_Company implements BankServices{

    BankServices bs;
    @Override
    public void hello() {
        System.out.println("this method u are calling from the company portal");
    }

    XYZ_Company(BankServices bs){
        this.bs = bs;
    }

    public void serviceMethod(){
        bs.hello();
    }

}
