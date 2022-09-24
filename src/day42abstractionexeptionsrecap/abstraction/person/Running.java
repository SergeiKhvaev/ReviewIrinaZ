package day42abstractionexeptionsrecap.abstraction.person;

import java.util.ArrayList;
import java.util.Arrays;

public class Running {
    public static void main(String[] args) {

        //We can not make Employee object because of abstract
        //We can not make Person object because of abstract

        Tester testerOne = new Tester("Sergei", 39, "SDET", 120_000);
        System.out.println(testerOne);// toString from Employee, which called toString of Person class

        testerOne.work();
        testerOne.sleep(9);

        ArrayList <Tester>
 testers = new ArrayList<>();
        testers.add(testerOne);

        testers.addAll(Arrays.asList(
                new Tester("Katy", 36, "Engenir", 250_000),
                new Tester("Eva", 39, "SDET", 120_000),
                new Tester("Anatoly", 29, "SDET", 1550_000)

        ));

        System.out.println("===============================");
        for(Tester each : testers){
            System.out.println(each);

            each.sleep(8);
            System.out.println();
        }



    }
}
