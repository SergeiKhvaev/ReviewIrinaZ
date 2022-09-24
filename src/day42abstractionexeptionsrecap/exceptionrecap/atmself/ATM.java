package day42abstractionexeptionsrecap.exceptionrecap.atmself;

public class ATM {

    public static String atm(int balance, int withdrow) {
        int remains = 0;
        if (balance - withdrow >= 0) {
            remains += balance - withdrow;
            return "witdrowed " + withdrow + " " + "balance " + remains;
        } else {

            throw new BelowZeroException(); // we throw custom unchecked exception if else statment will be true
        }

    }

}
