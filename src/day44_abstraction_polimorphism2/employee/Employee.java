package day44_abstraction_polimorphism2.employee;

public abstract class Employee extends Person{
    String title;
    double  salary;


    public Employee(String name, String title, double salary) {
        super(name);
        this.title = title;
        this.salary = salary;
    }
    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
