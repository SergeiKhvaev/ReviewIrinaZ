package day42abstractionexeptionsrecap.exceptionrecap.vendingmachin;

public class run {
    public static void main(String[] args) {

        System.out.println(VendingMachine.select(1));// this method has unchecked exception - normally these exception are not handle
        // select of 2 causing excetpion


        try {
        System.out.println(VendingMachine.selectValid(5));// need handle checked exception -> try catch used

    } catch (InvalidSelectionExeption e){ // we handeled custom checked exception
            System.out.println(e.getMessage());
        }
        }
}
