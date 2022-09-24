package day42abstractionexeptionsrecap.exceptionrecap.vendingcheckedxc;

public class Run {
    public static void main(String[] args) {

        try{
        System.out.println(VendingMachineSecond.sodaMachine("fanta")); // complaning because we still have unhandled checked exception
            } catch (InvalidselectSelf e){
            System.out.println(e.getMessage());
           // e.printStackTrace();


        }

        System.out.println("Sergei");// if we handle checked exception we will see that message

    }

}
