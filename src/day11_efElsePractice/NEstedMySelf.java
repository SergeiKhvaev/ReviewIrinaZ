package day11_efElsePractice;

public class NEstedMySelf {
    public static void main(String[] args) {

        // age shoulde be 0 -120
        //   < 1 - baby
        //    2-5 - toddler
        // 6-14 - kid
        //    14-18- young adult
        // 19 -40 adult
        //41 - 65 middle age adult
        // > 65 - senior

        int age = 0;

      if (age >= 0 && age <= 120) {
        System.out.println("Valid age");
            if (age <= 1) {
                System.out.println("baby");
            } else if (age <= 5) {
                System.out.println("Toddler");
            } else if (age <= 14) {
                System.out.println("Kid");
            } else if (age <= 18) {
                System.out.println("Young adult");
            } else if (age <= 40) {
                System.out.println("Adult");
            } else if (age <= 65) {
                System.out.println("Middle age adult");
            } else if (age > 65) {
                System.out.println("Senior");
            }

        } else {
                if (age < 0) {
                    System.out.println("Not born");}
                else {
                    System.out.println("Nobody live so long");
                }

            }
        }
    }






