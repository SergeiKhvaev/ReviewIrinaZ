package day11_efElsePractice;

public class IfNested {
    public static void main(String[] args) {

        // ages 18 -35
        //high school doploma
        //citizen

        int age = 36;
        boolean hasDiploma = false;
        boolean isCitizen = false;

        if ((age >= 18 && age <= 35) && hasDiploma && isCitizen) {
            System.out.println("You qualify for the army");
        } else {
            // this block about age
            if (age < 0 || age > 120) {
                System.out.println("Not a valid age number");
            } else if (age < 18) {
                System.out.println("too young");
            } else if (age > 35) {
                System.out.println("Too old");
            }
            // this block about diploma
        }
        if (!hasDiploma) {
            System.out.println("No diploma");
        }
        // check sitizenship
        if (!isCitizen) {
            System.out.println("need to be citizen");
        }

    } // end of else for qualifaing


    }
