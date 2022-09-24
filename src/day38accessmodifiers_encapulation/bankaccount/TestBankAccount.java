package day38accessmodifiers_encapulation.bankaccount;

public class TestBankAccount {
    public static void main(String[] args) {

        BAnkAccount account1 = new BAnkAccount(23231323, 33232);


       // BAnkAccount.balance = 1222;
      //  BAnkAccount.setBallance - we didn t create that method// balance and account have onle getter, no setter, so I can change it


        System.out.println(account1.getAccountNum());
        System.out.println(account1.getBalance());
    }
}
