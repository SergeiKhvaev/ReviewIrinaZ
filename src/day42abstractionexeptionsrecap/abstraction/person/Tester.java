package day42abstractionexeptionsrecap.abstraction.person;

import javax.sound.midi.Soundbank;

public class Tester extends Employee{ // first concrete class


    public Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }



    @Override
    public void work() { // overriden from Employee class
        System.out.println("Ranning TC");
        System.out.println("Fiding locators");

    }

    @Override
    public void sleep(int hours) {// overriden from Person class
        System.out.println(name + "sleep for " + hours + " while the automation performing");
    }
}
