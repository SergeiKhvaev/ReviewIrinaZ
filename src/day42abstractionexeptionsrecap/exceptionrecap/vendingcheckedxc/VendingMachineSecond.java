package day42abstractionexeptionsrecap.exceptionrecap.vendingcheckedxc;

public class VendingMachineSecond {

    public static String sodaMachine(String type) throws InvalidselectSelf{ // make that method ignor checked eception// that why it stops to complaining
        String result = "";
        if(type.equals("Coca-cola")){
            result = "Coca-cola";
        } else if (type.equals("Fanta")){
            result = "Fanta";
        } else {

        throw new InvalidselectSelf(); // still complaning because coppiler see checked exception
        }


        return result;

    }

}
