package day41exeptions.bank;

public class Bank {
    double balance;

    public void withdraw (double amount){ // ������� ������� ����� � ����� ���� ���������� amount
        if(amount  > balance){
            throw new NotEnoughMoneyException(); // use throw new (������� ���� exception)
        }
        balance -= amount;
        System.out.println("Money withdraw");
    }

}
