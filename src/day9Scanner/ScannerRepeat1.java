package day9Scanner;

public class ScannerRepeat1 {

    public static void main(String[] args){

double balance = 1_000_000;
double amountToWithdraw = 1500_001;
double remain = balance - amountToWithdraw;

if (amountToWithdraw >= balance){
    System.out.println("Over draft penalty");

}

//System.out.println(remain);


    }


}
