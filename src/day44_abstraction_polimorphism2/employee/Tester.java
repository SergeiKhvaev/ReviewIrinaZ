package day44_abstraction_polimorphism2.employee;

public class Tester extends Employee implements CreateSmokeTest{
    public Tester(String name, String title, double salary) {
        super(name, title, salary);
    }

    @Override
    public void work(){
        System.out.println("Run testcase");

    }

   public void writeBugReport(){
        System.out.println("Found bug");
   }




    @Override
    public void create(){
        System.out.println("Create smoke test");
    }

}
