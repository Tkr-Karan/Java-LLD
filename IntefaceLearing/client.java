package IntefaceLearing;


import IntefaceLearing.ClassDoubt.Emp1;
import IntefaceLearing.ClassDoubt.Employee;

public class client {
    public static void main(String[] args) {
        BankServices bs = new SecondClass();

        bs.hello();
        Employee e1 = new Emp1();

        e1.userDataPrint();

//        XYZ_Company company = new XYZ_Company();
    }
}
