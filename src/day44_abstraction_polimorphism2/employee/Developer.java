package day44_abstraction_polimorphism2.employee;

public class Developer extends Employee{

    public Developer(String name, String title, double salary) {
        super(name, title, salary);
    }
    @Override
    public void work(){
        System.out.println("write function");
    }

    public void unitTesting(){
        System.out.println("Run unit test");
    }

}
