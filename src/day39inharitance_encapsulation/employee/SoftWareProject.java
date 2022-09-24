package day39inharitance_encapsulation.employee;

public class SoftWareProject {
    public static void main(String[] args) {
        Employee SuperClass = new Employee("Anatoliy", true, 120_000);
        SuperClass.work();
        System.out.println(SuperClass.name);
        System.out.println(SuperClass.isFullTime);
        System.out.println(SuperClass.salary);
        System.out.println(SuperClass);

        System.out.println("==========================");

        Tester sergei = new Tester("Sergei Khvalev", true, 110_000, "Bug searcher and fixer");
        System.out.println(sergei);
        sergei.test();// call method of sub class
        System.out.println(sergei.name);
        System.out.println(sergei.isFullTime);
        System.out.println(sergei.salary);
        System.out.println(sergei.bugsFound);
        sergei.salary = 150_000; // reassign salary amount
        System.out.println(sergei.salary);
        System.out.println(sergei);

        System.out.println("===========================");

        Developer ekaterina = new Developer("Ekaterina Starovoitova", true, 220_000, "All need features can devalop");
        System.out.println(ekaterina);
        ekaterina.develop();// method of Sub class called
        System.out.println(ekaterina.name);
        System.out.println(ekaterina.isFullTime);
        System.out.println(ekaterina.salary);
        System.out.println(ekaterina.featuresCteated);
        ekaterina.salary = 300_000;// salary reassign
        System.out.println(ekaterina);

    }
}
