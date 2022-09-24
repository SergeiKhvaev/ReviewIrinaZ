package day41exeptions.bank;

public class Run {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.balance = 2000;

        bank.withdraw(2000);
        System.out.println(bank.balance);


        bank.withdraw(2000);// my exception will works

    }
}
