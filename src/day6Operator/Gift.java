package day6Operator;

public class Gift {

    public static void main(String[] args){

        int giftCard = 500;
        int timeUsed = 3;
        System.out.println("Using gift card: " + (giftCard-150) + " and " + --timeUsed);
        giftCard = 350;
        System.out.println("Using gift card: " + (giftCard-99) + " and " + --timeUsed);


        System.out.println("------------------------------------------------------------");

        int a1 = 8;
        int b1 = ++a1;// 9
        System.out.println(b1);
        System.out.println(a1);

        System.out.println("=============================================================");

        int b2 = 8;
        System.out.println(b2--); // 8
        System.out.println(b2); // 7
        System.out.println("---------------------------------------------------------------");

        int a2 = 8;
        int b3 = a2 --;
        System.out.println(a2);


        System.out.println("=========================================================");
        int a = 8; // 7
        int b = a--; // 8
        // b = still 8
        // a = starting from first SOUT become 7
        System.out.println(a);//7
        System.out.println(a--);//7
        System.out.println(a);//6
        System.out.println(b);// 8
        System.out.println(b); //8

        System.out.println("------------------------------------------------------------");
        int year = 2022;
        boolean yeayIsLeap = year % 4 == 0;
        System.out.println("2022 is leap: " + yeayIsLeap);

        System.out.println ("============================================================");







    }
}
