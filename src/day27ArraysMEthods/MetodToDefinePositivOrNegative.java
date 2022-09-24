package day27ArraysMEthods;

public class MetodToDefinePositivOrNegative {
        public static void number(int num){
        if (num > 0){
            System.out.println(num + " is positive number");
        } else if(num < 0){
            System.out.println(num + " is negative number");
            } else {
            System.out.println(num + " is zero");
        }
    }

    public static void main(String[] args) {
        number(0);
    }
}
