package day41exeptions.bank;

public class Bank {
    double balance;

    public void withdraw (double amount){ // создали обычный метод и ввели свою переменную amount
        if(amount  > balance){
            throw new NotEnoughMoneyException(); // use throw new (создали свой exception)
        }
        balance -= amount;
        System.out.println("Money withdraw");
    }

}
