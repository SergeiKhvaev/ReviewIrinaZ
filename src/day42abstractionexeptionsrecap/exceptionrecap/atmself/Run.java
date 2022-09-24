package day42abstractionexeptionsrecap.exceptionrecap.atmself;

public class Run {
    public static void main(String[] args) {

        System.out.println(ATM.atm(1000, 500));
        System.out.println(ATM.atm(1000, 343));

       System.out.println(ATM.atm(1000, 2300));// custom uncheced exception will be throw, because negative balance is expected
    }
}
