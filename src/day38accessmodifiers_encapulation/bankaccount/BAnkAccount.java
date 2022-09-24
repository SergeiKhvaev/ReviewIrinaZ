package day38accessmodifiers_encapulation.bankaccount;

public class BAnkAccount {

    //this  file will be read-only(no any changes)

    private long accountNum;
    private double balance;

    public BAnkAccount(long accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    // there is no setter at all, so user can change those variables (initialazevariable one time, bat those object can be changes
}
