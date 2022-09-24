package day44_abstraction_polimorphism2.employee;

public class Run {
    public static void main(String[] args) {
        // reference of  super classes
        Person tester1 = new Tester("Sergei", "SDET", 150000); // executed alwaye object site
        //tester1.work(); not accessible because Person referance does not has accese to those methods, acces only tio name variable
        //tester1.create();
        tester1.writeBugReport();
        System.out.println(tester1);

        /* another reference
        Employee tester2 = new Tester("Katy", "SDET2", 200_000);
        tester2.work(); // with that reference we have acsece to that method + name, salary, jobTitle, work()// that work() because we have implementation in tester class
        System.out.println(tester2);

        // valid syntax, but that reference do not provide any access to enything new
        Object tester3 = new Tester("Eva", "SDET3", 300000);
        //tester3 does not have any access


        // reference to the interface

        CreateSmokeTest tester4 = new Tester("Ethel", "SDET4", 1500000);
        //tester4.work(); // no access from that referanse
        tester4.create(); //


        // referensce object to itself

        Tester tester6 = new Tester("Anatoliy", "SDET7", 1750000);
        // througth that reference we have full access to all method and variables, с учетом inharitance and implements

         */

    }
}
